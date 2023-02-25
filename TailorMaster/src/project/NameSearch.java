package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class NameSearch {

	private JFrame frame;
	private JTextField nametxt;
	private JButton del;
	private JButton back;
	
	Connection con;
	ResultSet rs ;
	Statement st;
	PreparedStatement pst ;
	private JLabel emp_lbl;
	
	String n ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameSearch window = new NameSearch();
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
	public NameSearch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 250, 482, 213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("Enter Name:");
		name.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		name.setForeground(Color.WHITE);
		name.setBounds(32, 49, 105, 28);
		frame.getContentPane().add(name);
		
		nametxt = new JTextField();
		nametxt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		nametxt.setBounds(147, 49, 285, 26);
		frame.getContentPane().add(nametxt);
		nametxt.setColumns(10);
		
		
		nametxt.setText(n);
		del = new JButton("Delete");
		del.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		del.setBackground(new Color(0, 0, 139));
		del.setForeground(new Color(255, 255, 255));
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(nametxt.getText().trim().isEmpty())
				{
					emp_lbl.setText("TextField is empty ...");
				}
				else
				{
					
					String name = nametxt.getText();
					int optionresult = JOptionPane.showConfirmDialog(null, "Are your sure to delete the record","warning",JOptionPane.YES_NO_CANCEL_OPTION);
					if(optionresult == JOptionPane.YES_OPTION)
					{
						try
						{
						Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
						
						con = DriverManager.getConnection("jdbc:ucanaccess://E:\\TailorData.accdb");
					
						
						pst = con.prepareStatement("Delete from data where name = ?");
						
						 
						pst.setString(1, name);
	//					String sql = "DELETE FROM data " +
	//				               "WHERE name ="+ name ;
						int a = pst.executeUpdate();
						if(a ==1 )
						{
							JOptionPane.showMessageDialog(null, "Record deleted successfull ...");
						}
						else
					     {
					    	 JOptionPane.showMessageDialog(null, "No Record found ...");
					     }
						
						
						
						
						
						
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
					}}
				
				
			}
		});
		del.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		del.setBounds(343, 124, 89, 28);
		frame.getContentPane().add(del);
		
		back = new JButton("Back");
		back.setBackground(new Color(0, 0, 139));
		back.setForeground(new Color(255, 255, 255));
		back.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteRecord obj = new DeleteRecord();
				frame.dispose();
			}
		});
		back.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		back.setBounds(10, 128, 89, 28);
		frame.getContentPane().add(back);
		
		emp_lbl = new JLabel("");
		emp_lbl.setForeground(Color.RED);
		emp_lbl.setBounds(147, 84, 206, 14);
		frame.getContentPane().add(emp_lbl);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\eclipse-workspace\\TailorMaster\\Images\\photo-1497997092403-f091fcf5b6c4.jpg"));
		lblNewLabel.setBounds(0, 0, 466, 174);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
		
		
		
	}
}
