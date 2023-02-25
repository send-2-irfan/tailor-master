package tailor_master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import project.secondPage;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;

public class Tailor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tailor window = new Tailor();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tailor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		frame.setBounds(450, 250, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rex Tailor");
		lblNewLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 35));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(155, 11, 156, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JButton clothes = new JButton("Enter");
		clothes.setBackground(new Color(0, 0, 139));
		clothes.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		clothes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondPage sp = new secondPage();
				frame.dispose();
			}
		});
		clothes.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		clothes.setForeground(Color.WHITE);
		clothes.setBounds(234, 118, 91, 30);
		frame.getContentPane().add(clothes);
		
		JLabel lblClothes = new JLabel("Clothes ");
		lblClothes.setForeground(Color.WHITE);
		lblClothes.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		lblClothes.setBounds(141, 119, 83, 28);
		frame.getContentPane().add(lblClothes);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\eclipse-workspace\\TailorMaster\\Images\\photo-1497997092403-f091fcf5b6c4.jpg"));
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(lblNewLabel_1);
		
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
