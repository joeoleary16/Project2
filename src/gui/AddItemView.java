package gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class AddItemView extends JPanel {

	/**
	 * Create the panel.
	 */
	public AddItemView() {
		
		JLabel lblAddItem = new JLabel("Add Item");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(194)
					.addComponent(lblAddItem)
					.addContainerGap(194, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAddItem)
					.addContainerGap(273, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
