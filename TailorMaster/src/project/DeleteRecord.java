package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;

public class DeleteRecord {

	private JFrame frame;
	
	Connection con;
	ResultSet rs ;
	Statement st;
	PreparedStatement pst ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteRecord window = new DeleteRecord();
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
	public DeleteRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 250, 450, 241);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton search_by_name = new JButton("Search by Name");
		search_by_name.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		search_by_name.setBackground(new Color(0, 0, 139));
		search_by_name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			
				
				NameSearch obj = new NameSearch();
				frame.dispose();
				
			}});
		search_by_name.setForeground(new Color(255, 255, 255));
		search_by_name.setIcon(null);
		search_by_name.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		search_by_name.setBounds(114, 24, 204, 41);
		frame.getContentPane().add(search_by_name);
		frame.setTitle("Delete Record");
		
		JButton search_by_id = new JButton("Search by ID");
		search_by_id.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		search_by_id.setBackground(new Color(0, 0, 139));
		search_by_id.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SearchID obj = new SearchID();
				frame.dispose();
				
			}
		});
		search_by_id.setForeground(new Color(255, 255, 255));
		search_by_id.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		search_by_id.setBounds(114, 90, 204, 41);
		frame.getContentPane().add(search_by_id);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondPage obj = new secondPage();
				frame.dispose();
			}
		});
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		back.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.setBackground(new Color(0, 0, 139));
		back.setBounds(10, 156, 81, 35);
		frame.getContentPane().add(back);
		
		JButton close = new JButton("Close");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
					
		});
		close.setForeground(Color.WHITE);
		close.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		close.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		close.setBackground(new Color(0, 0, 139));
		close.setBounds(343, 156, 81, 35);
		frame.getContentPane().add(close);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\eclipse-workspace\\TailorMaster\\Images\\photo-1497997092403-f091fcf5b6c4.jpg"));
		label.setBounds(0, 0, 434, 202);
		frame.getContentPane().add(label);
		frame.setVisible(true);
	}
}
