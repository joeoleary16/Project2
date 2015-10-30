package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class MakeOrderView extends JPanel {
	Application root;
	JLabel lblMakeOrder;	
	JList listItems;
	JButton btnAddItem;
	JButton btnConfirmOrder;
	JComboBox cbxLocation;
	JLabel lblLocation;
	JLabel lblDocument;
	JLabel lblDocumentName;
	JButton btnUpload;
	JButton btnDeleteItem;
	
	/**
	 * Create the panel.
	 */
	public MakeOrderView(Application root) {
		this.root = root;
		lblMakeOrder = new JLabel("Make Order");
		listItems = new JList();
		btnAddItem = new JButton("+");
		btnConfirmOrder = new JButton("Confirm Order");
		cbxLocation = new JComboBox();
		lblLocation = new JLabel("Location:");
		lblDocument = new JLabel("Document:");
		lblDocumentName = new JLabel("document name");
		btnUpload = new JButton("Upload");
		
		JButton btnDeleteItem = new JButton("-");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLocation)
								.addComponent(lblDocument))
							.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cbxLocation, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(12)
									.addComponent(lblDocumentName)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnUpload)))
							.addGap(40))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnConfirmOrder)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(listItems, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnDeleteItem, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAddItem))))
							.addGap(32))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(198)
							.addComponent(lblMakeOrder)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMakeOrder)
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(listItems, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAddItem)
							.addGap(11)
							.addComponent(btnDeleteItem)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLocation)
						.addComponent(cbxLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnUpload))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(17)
							.addComponent(lblDocumentName))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(17)
							.addComponent(lblDocument)))
					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
					.addComponent(btnConfirmOrder)
					.addContainerGap())
		);
		setLayout(groupLayout);
		addEventListeners();
	}
	
	private void addEventListeners() {
		btnAddItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				root.swapPane(new AddItemView(root));
			}
		});	
	}
}
