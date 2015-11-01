package gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import domain.Location;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RequestService extends JPanel {
    private Application root;
	private JTextField txtName;
	private JTextField txtDescription;
	private JTextField txtTime;
	private JButton btnRequestService;
    private String serviceID;
    private JComboBox comboBox;
    private String[] locationID;

    /**
     * Create the panel.
     * 
     * This is generated code and should not be edited manually.
     */
	public RequestService(Application root) {
        this.root = root;
        serviceID = Application.controller.requestService(root.getStaffID());
		
		JLabel lblRequestService = new JLabel("Request Service");
		
		JLabel lblName = new JLabel("Name");
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		
		txtDescription = new JTextField();
		txtDescription.setColumns(10);
		
		JLabel lblEstTime = new JLabel("Estimated Time");
		
		txtTime = new JTextField();
		txtTime.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		
		ArrayList<Location> locations = Application.controller.getLocations();
        locationID = new String[locations.size()];
        String[] locationName = new String[locations.size()];
        for (int i = 0; i < locations.size(); ++i) {
        	locationID[i] = locations.get(i).getId();
        	locationName[i] = locations.get(i).getName();
        }
		
		comboBox = new JComboBox(locationName);
		
		btnRequestService = new JButton("Request Service");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addComponent(lblRequestService))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(24)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblDescription)
								.addComponent(lblName)
								.addComponent(lblEstTime)
								.addComponent(lblLocation))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtTime)
								.addComponent(txtDescription)
								.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))
					.addContainerGap(98, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(173, Short.MAX_VALUE)
					.addComponent(btnRequestService)
					.addGap(166))
		);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(5)
								.addComponent(lblRequestService)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblName))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblDescription)
										.addComponent(txtDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEstTime)
										.addComponent(txtTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblLocation))
								.addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
								.addComponent(btnRequestService)
								.addContainerGap())
		);
		setLayout(groupLayout);
		addEventListeners();
	}

	private void addEventListeners() {
		btnRequestService.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	int response = JOptionPane.showConfirmDialog(null, "Are you sure you would like to request this service?");
            	if (response == JOptionPane.YES_OPTION) {
            		Application.controller.enterServiceDetails(serviceID, txtName.getText(), txtDescription.getText(), Double.parseDouble(txtTime.getText()), locationID[comboBox.getSelectedIndex()]);
                    root.swapPane(new MainView(root));
            	}                
            }
        });
	}
}
