package gui;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JPanel {
    private Application root;
    private JButton btnMakeOrder;
    private JButton btnRequestService;

    /**
     * Create the panel.
     * 
     * This is generated code and should not be edited manually.
     */
    public MainView(Application root) {
        this.root = root;
        JLabel lblTitle = new JLabel("Integrated University Department Information System");
        btnMakeOrder = new JButton("Make Order");
        btnRequestService = new JButton("Request Service");

        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(34)
                                                .addComponent(lblTitle))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(151)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnMakeOrder, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnRequestService, GroupLayout.Alignment.LEADING))))
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
            public void actionPerformed(ActionEvent actionEvent) {
                root.swapPane(new MakeOrderView(root, ""));
            }
        });

        btnRequestService.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                root.swapPane(new RequestService(root));
            }
        });
    }
}
