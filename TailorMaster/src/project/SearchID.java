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
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

class MyExp extends Exception
{
	MyExp()
	{
		super("You Entered nothing ...");
	}
}


public class SearchID {

	private JFrame frame;
	private JTextField idtxt;
	
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
					SearchID window = new SearchID();
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
	public SearchID() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 250, 417, 182);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton back = new JButton("Back");
		back.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		back.setForeground(new Color(255, 255, 255));
		back.setBackground(new Color(0, 0, 139));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteRecord obj = new DeleteRecord();
				frame.dispose();
			}
		});
		back.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		back.setBounds(10, 104, 89, 28);
		frame.getContentPane().add(back);
		
		JButton delete = new JButton("Delete");
		delete.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		delete.setForeground(new Color(255, 255, 255));
		delete.setBackground(new Color(0, 0, 139));
		
		delete.setFont(new Font("Modern No. 20", Font.PLAIN, 18));
		delete.setBounds(302, 104, 89, 28);
		frame.getContentPane().add(delete);
		
		idtxt = new JTextField();
		idtxt.setToolTipText("please write id in numbers.");
		idtxt.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		idtxt.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		idtxt.setColumns(10);
		idtxt.setBounds(125, 37, 254, 26);
		frame.getContentPane().add(idtxt);
		
		JLabel lblEnterId = new JLabel("Enter ID:");
		lblEnterId.setForeground(new Color(255, 255, 255));
		lblEnterId.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblEnterId.setBounds(24, 36, 89, 28);
		frame.getContentPane().add(lblEnterId);
		
		JLabel search_lbl = new JLabel("");
		search_lbl.setForeground(Color.RED);
		search_lbl.setBounds(123, 70, 146, 14);
		frame.getContentPane().add(search_lbl);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\eclipse-workspace\\TailorMaster\\Images\\photo-1497997092403-f091fcf5b6c4.jpg"));
		lblNewLabel.setBounds(0, 0, 401, 143);
		frame.getContentPane().add(lblNewLabel);
		
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)   {
				
					int id ;
					
					if(idtxt.getText().trim().isEmpty())
					{
						search_lbl.setText("Search Feild is empth.");
					}
					
						id = Integer.parseInt(idtxt.getText());
					
				
				
				int optionresult = JOptionPane.showConfirmDialog(null, "Are your sure to delete the record","warning",JOptionPane.YES_NO_CANCEL_OPTION);
				if(optionresult == JOptionPane.YES_OPTION)
				{
					try
					{
					   Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					
					   con = DriverManager.getConnection("jdbc:ucanaccess://E:\\TailorData.accdb");
				
					
					    pst = con.prepareStatement("Delete from data where RecordID = ?");
					    pst.setInt(1, id);
//					String sql = "DELETE FROM data " +
//				               "WHERE name ="+ name ;
					    
					     int a = pst.executeUpdate();
					     
					     if(a==1)
					     {
					    	 JOptionPane.showMessageDialog(null, "Record deleted successfully...");
					     }
					     
				    	
				    	
					
					
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				
			}
				
		}});
		
		
		frame.setVisible(true);
	}

}
