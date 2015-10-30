package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import domain.Controller;

public class Application {

	private JFrame frmIudis;
	private static Controller controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		controller = new Controller();
		EventQueue.invokeLater(new Runnable() {
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

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
}
