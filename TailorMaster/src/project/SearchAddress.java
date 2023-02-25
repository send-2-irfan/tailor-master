package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class SearchAddress {

	private JFrame frame;
	private JTextField nametxt;
	private JTextField addresstxt;
	
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
					SearchAddress window = new SearchAddress();
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
	public SearchAddress() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 250, 450, 201);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Delete");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = nametxt.getText();
				String address = addresstxt.getText();
				int optionresult = JOptionPane.showConfirmDialog(null, "Are your sure to delete the record","warning",JOptionPane.YES_NO_CANCEL_OPTION);
				if(optionresult == JOptionPane.YES_OPTION)
				{
					try
					{
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					
					con = DriverManager.getConnection("jdbc:ucanaccess://D:\\TailorDataTable.accdb");
				
					
					pst = con.prepareStatement("Delete from data where name = ? And address = ?");
					pst.setString(1, name);
					pst.setString(2, address);
//					String sql = "DELETE FROM data " +
//				               "WHERE name ="+ name ;
					pst.executeUpdate();
					
					
					
					
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
		}});
		button.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		button.setBounds(316, 110, 89, 28);
		frame.getContentPane().add(button);
		
		nametxt = new JTextField();
		nametxt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		nametxt.setColumns(10);
		nametxt.setBounds(139, 33, 254, 26);
		frame.getContentPane().add(nametxt);
		
		JLabel label = new JLabel("Enter Name:");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label.setBounds(24, 32, 105, 28);
		frame.getContentPane().add(label);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteRecord obj = new DeleteRecord();
				frame.dispose();
			}
		});
		button_1.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		button_1.setBounds(24, 110, 89, 28);
		frame.getContentPane().add(button_1);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblAddress.setBounds(24, 71, 105, 28);
		frame.getContentPane().add(lblAddress);
		
		addresstxt = new JTextField();
		addresstxt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		addresstxt.setColumns(10);
		addresstxt.setBounds(139, 70, 254, 26);
		frame.getContentPane().add(addresstxt);
	}
}
