package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import tailor_master.Tailor;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;

public class secondPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secondPage window = new secondPage();
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
	public secondPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(500, 250, 536, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Rex Tailors");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		label.setBounds(181, 11, 170, 43);
		frame.getContentPane().add(label);
		
		JButton addData = new JButton("Add New Record");
		addData.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		addData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Clothes c = new Clothes();
				
				frame.dispose();
			}
		});
		addData.setForeground(new Color(255, 255, 255));
		addData.setBackground(new Color(0, 0, 139));
		addData.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		addData.setBounds(172, 86, 191, 34);
		frame.getContentPane().add(addData);
		
		JButton search = new JButton("Find/Search");
		search.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ShowData obj = new ShowData();
				frame.dispose();
			}
		});
		search.setForeground(new Color(255, 255, 255));
		search.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		search.setBackground(new Color(0, 0, 139));
		search.setBounds(172, 138, 191, 34);
		frame.getContentPane().add(search);
		
		JButton delete = new JButton("Delete Record");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DeleteRecord obj = new DeleteRecord();
				frame.dispose();
				
				
				
			}
		});
		delete.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		delete.setForeground(new Color(255, 255, 255));
		delete.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		delete.setBackground(new Color(0, 0, 139));
		delete.setBounds(172, 200, 191, 34);
		frame.getContentPane().add(delete);
		
		JButton back = new JButton("Back");
		back.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tailor t = new Tailor();
				frame.dispose();
			}
		});
		back.setForeground(new Color(255, 255, 255));
		back.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		back.setBackground(new Color(0, 0, 139));
		back.setBounds(10, 295, 92, 34);
		frame.getContentPane().add(back);
		
		JButton home = new JButton("Close");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		home.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		home.setForeground(new Color(255, 255, 255));
		home.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		home.setBackground(new Color(0, 0, 139));
		home.setBounds(407, 295, 92, 34);
		frame.getContentPane().add(home);
		
		JLabel bg_image = new JLabel("");
		bg_image.setVerticalAlignment(SwingConstants.TOP);
		bg_image.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\eclipse-workspace\\TailorMaster\\Images\\photo-1497997092403-f091fcf5b6c4.jpg"));
		bg_image.setBounds(0, 0, 520, 340);
		frame.getContentPane().add(bg_image);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
