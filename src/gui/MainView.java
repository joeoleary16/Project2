package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel {
	private Application root;
	private JButton btnMakeOrder;
	private JLabel lblTitle;
	private JButton btnRequestService;
	
	/**
	 * Create the panel.
	 */
	public MainView(Application root) {
		this.root = root;
		lblTitle = new JLabel("Integrated University Department Information System");
		btnMakeOrder = new JButton("Make Order");
		btnRequestService = new JButton("Request Service");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(lblTitle))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(151)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnMakeOrder, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnRequestService, Alignment.LEADING))))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitle)
					.addGap(75)
					.addComponent(btnMakeOrder)
					.addGap(27)
					.addComponent(btnRequestService)
					.addContainerGap(121, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		addEventListeners();
	}
	
	private void addEventListeners() {
		btnMakeOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				root.swapPane(new MakeOrderView(root));
			}
		});
		
	}
}
