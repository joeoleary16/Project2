package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import domain.Controller;

public class Application {
	public static Controller controller;
	private static String staffID = "";
    private JFrame frmIudis;

    public static void main(String[] args) {
    	controller = new Controller();
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

    public Application() {
        initialize();
    }

    private void initialize() {
        frmIudis = new JFrame();
        frmIudis.setTitle("IUDIS");
        frmIudis.setBounds(100, 100, 401, 265);
        frmIudis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainView mainView = new MainView(this);
        frmIudis.getContentPane().add(mainView, BorderLayout.CENTER);
        frmIudis.pack();
    }

    public void swapPane(JPanel newPanel) {
        frmIudis.getContentPane().removeAll();
        frmIudis.getContentPane().add(newPanel);
        frmIudis.pack();
    }

	public static String getStaffID() {
		return staffID;
	}

	public static void setStaffID(String staffID) {
		Application.staffID = staffID;
	}
}
