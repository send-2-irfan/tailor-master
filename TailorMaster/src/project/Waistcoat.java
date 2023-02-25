package project;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Waistcoat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waistcoat window = new Waistcoat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Waistcoat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500,250, 535, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
