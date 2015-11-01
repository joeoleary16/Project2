package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddItemView extends JPanel {
	private Application root;
	private String orderID;
	private JTextField txtNamefield;
	private JTextField txtDescription;
	private JTextField txtCatalogID;
	private JTextField txtPrice;
	private JTextField txtQuantity;
	private JButton btnAddItem;

    /**
     * Create the panel.
     */
    public AddItemView(Application root, String orderID) {
    	this.root = root;
    	this.orderID = orderID;
        JLabel lblAddItem = new JLabel("Add Item");
        
        JLabel lblName = new JLabel("Name");
        
        txtNamefield = new JTextField();
        txtNamefield.setColumns(10);
        
        JLabel lblDescription = new JLabel("Description");
        
        txtDescription = new JTextField();
        txtDescription.setColumns(10);
        
        JLabel lblCatalogId = new JLabel("Catalog ID");
        
        txtCatalogID = new JTextField();
        txtCatalogID.setColumns(10);
        
        JLabel lblPrice = new JLabel("Price");
        
        txtPrice = new JTextField();
        txtPrice.setColumns(10);
        
        JLabel lblQuantity = new JLabel("Quantity");
        
        txtQuantity = new JTextField();
        txtQuantity.setColumns(10);
        
        JLabel lblSupplier = new JLabel("Supplier");
        
        JComboBox comboBox = new JComboBox();
        
        btnAddItem = new JButton("Add Item");
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(194)
        					.addComponent(lblAddItem))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(16)
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lblDescription)
        						.addComponent(lblName)
        						.addComponent(lblCatalogId)
        						.addComponent(lblPrice)
        						.addComponent(lblQuantity)
        						.addComponent(lblSupplier))
        					.addGap(18)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(txtQuantity)
        						.addComponent(txtPrice)
        						.addComponent(txtCatalogID)
        						.addComponent(txtDescription)
        						.addComponent(txtNamefield, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(178)
        					.addComponent(btnAddItem)))
        			.addContainerGap(131, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblAddItem)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblName)
        				.addComponent(txtNamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblDescription)
        				.addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblCatalogId)
        				.addComponent(txtCatalogID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblPrice)
        				.addComponent(txtPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblQuantity)
        				.addComponent(txtQuantity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblSupplier)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
        			.addComponent(btnAddItem)
        			.addContainerGap())
        );
        setLayout(groupLayout);
        addEventListeners();
    }
    
    private void addEventListeners() {
        btnAddItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            	Application.controller.addItem(orderID, txtCatalogID.getText(), txtNamefield.getText(), Integer.parseInt(txtQuantity.getText()), Double.parseDouble(txtPrice.getText()), txtDescription.getText(), "1");
                root.swapPane(new MakeOrderView(root, orderID));
            }
        });
    }
}
