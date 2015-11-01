package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import domain.Controller;
import domain.Location;
import domain.Supplier;

public class Application {
    public static Controller controller;
    private static String staffID = "";
    private JFrame frmIudis;

    public static void main(String[] args) {
    	controller = new Controller();
    	generateSampleData();
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Application window = new Application();
                    window.frmIudis.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /*
     * Sample data to be used to demonstrate the system
     */
    private static void generateSampleData() {
		ArrayList<Location> locations = new ArrayList<Location>();
		locations.add(new Location("a323", "A323 - Unum Lab", "Computer Lab"));
		locations.add(new Location("a310", "A310", "Computer Lab"));
		controller.setLocations(locations);
		ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
		suppliers.add(new Supplier("A","A","A","A","A"));
		suppliers.add(new Supplier("B","B","B","B","B"));
		controller.setSuppliers(suppliers);
	}

	public Application() {
        initialize();
    }

    private void initialize() {
        frmIudis = new JFrame();
        frmIudis.setTitle("IUDIS");
        frmIudis.setBounds(100, 100, 401, 265);
        frmIudis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmIudis.setResizable(false);

        MainView mainView = new MainView(this);
        frmIudis.getContentPane().add(mainView, BorderLayout.CENTER);
        frmIudis.pack();
    }

    public void swapPane(JPanel newPanel) {
        frmIudis.getContentPane().removeAll();
        frmIudis.getContentPane().add(newPanel);
        frmIudis.pack();
    }

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		Application.staffID = staffID;
	}
}
