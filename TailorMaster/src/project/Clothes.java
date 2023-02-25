package project;

import java.awt.EventQueue;

import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
public class Clothes {

	private JFrame frame;
	private JTextField nametxt;
	private JTextField lebaitxt;
	private JTextField bazotxt;
	private JTextField theratxt;
	private JTextField collartxt;
	private JTextField kamertxt;
	private JTextField shelwartxt;
	private JTextField paanchatxt;
	private JTextField shelwarkuhlitxt;
	private JTextField phonetxt;
	private JTextField idtxt;
	private JTextField addresstxt;
	
	//////////////////////////////////////////////////////////////////////////
	
	Connection con;
	ResultSet rs ;
	Statement st;
	PreparedStatement pst ;
	private JTextField lembaitxt;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clothes window = new Clothes();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Clothes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 80, 712, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Rex Tailors");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Modern No. 20", Font.PLAIN, 35));
		title.setBounds(297, 11, 165, 43);
		frame.getContentPane().add(title);
		
		JLabel name = new JLabel("Name");
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		name.setBounds(33, 65, 85, 33);
		frame.getContentPane().add(name);
		
		JLabel bazo = new JLabel("Bazo(Arm length)");
		bazo.setForeground(Color.WHITE);
		bazo.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		bazo.setBounds(33, 153, 150, 33);
		frame.getContentPane().add(bazo);
		
		JLabel thera = new JLabel("Thera(Shoulder)");
		thera.setForeground(Color.WHITE);
		thera.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		thera.setBounds(33, 197, 139, 33);
		frame.getContentPane().add(thera);
		
		JLabel colar = new JLabel("Collar length");
		colar.setForeground(Color.WHITE);
		colar.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		colar.setBounds(33, 241, 119, 33);
		frame.getContentPane().add(colar);
		
		JLabel kamer = new JLabel("Kamer (Waist)");
		kamer.setForeground(Color.WHITE);
		kamer.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		kamer.setBounds(33, 285, 139, 33);
		frame.getContentPane().add(kamer);
		
		JLabel shelwar = new JLabel("Shelwar");
		shelwar.setForeground(Color.WHITE);
		shelwar.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		shelwar.setBounds(33, 329, 85, 33);
		frame.getContentPane().add(shelwar);
		
		JLabel pancha = new JLabel("Paancha(Knee waist)");
		pancha.setForeground(new Color(255, 255, 255));
		pancha.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		pancha.setBounds(33, 373, 183, 33);
		frame.getContentPane().add(pancha);
		
		JLabel shelwarkuli = new JLabel("Shelwar Loose");
		shelwarkuli.setForeground(Color.WHITE);
		shelwarkuli.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		shelwarkuli.setBounds(33, 417, 139, 33);
		frame.getContentPane().add(shelwarkuli);
		
		JLabel designn = new JLabel("");
		designn.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\eclipse-workspace\\TailorMaster\\Images\\rm28-wood-aom-017_2.jpg"));
		designn.setBounds(0, 0, 739, 61);
		frame.getContentPane().add(designn);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\Desktop\\project walpaper\\rm28-wood-aom-017_2.jpg"));
		lblNewLabel.setBounds(343, 114, 13, 353);
		frame.getContentPane().add(lblNewLabel);
		
		nametxt = new JTextField();
		nametxt.setHorizontalAlignment(SwingConstants.CENTER);
		nametxt.setFont(new Font("Times New Roman", Font.BOLD, 22));
		nametxt.setForeground(Color.WHITE);
		nametxt.setBackground(Color.BLACK);
		nametxt.setToolTipText("Irfan khan\r\n");
		nametxt.setBounds(141, 65, 498, 33);
		frame.getContentPane().add(nametxt);
		nametxt.setColumns(10);
		
		
		bazotxt = new JTextField();
		bazotxt.setHorizontalAlignment(SwingConstants.CENTER);
		bazotxt.setForeground(Color.WHITE);
		bazotxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		bazotxt.setColumns(10);
		bazotxt.setBackground(Color.BLACK);
		bazotxt.setBounds(259, 154, 97, 28);
		frame.getContentPane().add(bazotxt);
		
		theratxt = new JTextField();
		theratxt.setHorizontalAlignment(SwingConstants.CENTER);
		theratxt.setForeground(Color.WHITE);
		theratxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		theratxt.setColumns(10);
		theratxt.setBackground(Color.BLACK);
		theratxt.setBounds(259, 198, 97, 28);
		frame.getContentPane().add(theratxt);
		
		collartxt = new JTextField();
		collartxt.setHorizontalAlignment(SwingConstants.CENTER);
		collartxt.setForeground(Color.WHITE);
		collartxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		collartxt.setColumns(10);
		collartxt.setBackground(Color.BLACK);
		collartxt.setBounds(259, 242, 97, 28);
		frame.getContentPane().add(collartxt);
		
		kamertxt = new JTextField();
		kamertxt.setHorizontalAlignment(SwingConstants.CENTER);
		kamertxt.setForeground(Color.WHITE);
		kamertxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		kamertxt.setColumns(10);
		kamertxt.setBackground(Color.BLACK);
		kamertxt.setBounds(259, 286, 97, 28);
		frame.getContentPane().add(kamertxt);
		
		shelwartxt = new JTextField();
		shelwartxt.setHorizontalAlignment(SwingConstants.CENTER);
		shelwartxt.setForeground(Color.WHITE);
		shelwartxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		shelwartxt.setColumns(10);
		shelwartxt.setBackground(Color.BLACK);
		shelwartxt.setBounds(259, 330, 97, 28);
		frame.getContentPane().add(shelwartxt);
		
		paanchatxt = new JTextField();
		paanchatxt.setHorizontalAlignment(SwingConstants.CENTER);
		paanchatxt.setForeground(Color.WHITE);
		paanchatxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		paanchatxt.setColumns(10);
		paanchatxt.setBackground(Color.BLACK);
		paanchatxt.setBounds(259, 374, 97, 28);
		frame.getContentPane().add(paanchatxt);
		
		shelwarkuhlitxt = new JTextField();
		shelwarkuhlitxt.setHorizontalAlignment(SwingConstants.CENTER);
		shelwarkuhlitxt.setForeground(Color.WHITE);
		shelwarkuhlitxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		shelwarkuhlitxt.setColumns(10);
		shelwarkuhlitxt.setBackground(Color.BLACK);
		shelwarkuhlitxt.setBounds(259, 418, 97, 28);
		frame.getContentPane().add(shelwarkuhlitxt);
		
		JLabel keff = new JLabel("Keff");
		keff.setForeground(Color.WHITE);
		keff.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		keff.setBounds(404, 125, 68, 22);
		frame.getContentPane().add(keff);
		
		JLabel lblBazoGolKinari = new JLabel("Bazo gol kinari");
		lblBazoGolKinari.setForeground(Color.WHITE);
		lblBazoGolKinari.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblBazoGolKinari.setBounds(404, 158, 125, 22);
		frame.getContentPane().add(lblBazoGolKinari);
		
		JLabel lblBazoGolPati = new JLabel("Bazo gol patti");
		lblBazoGolPati.setForeground(Color.WHITE);
		lblBazoGolPati.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblBazoGolPati.setBounds(404, 186, 119, 22);
		frame.getContentPane().add(lblBazoGolPati);
		
		JLabel lblCollarKiNok = new JLabel("Collar ki nok");
		lblCollarKiNok.setForeground(Color.WHITE);
		lblCollarKiNok.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblCollarKiNok.setBounds(404, 219, 119, 22);
		frame.getContentPane().add(lblCollarKiNok);
		
		JLabel lblJabSamnaiWali = new JLabel("Jab Samnaiy wali");
		lblJabSamnaiWali.setForeground(Color.WHITE);
		lblJabSamnaiWali.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblJabSamnaiWali.setBounds(404, 252, 150, 22);
		frame.getContentPane().add(lblJabSamnaiWali);
		
		JLabel lblJabSideWali = new JLabel("Jab Side wali");
		lblJabSideWali.setForeground(Color.WHITE);
		lblJabSideWali.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblJabSideWali.setBounds(404, 296, 139, 22);
		frame.getContentPane().add(lblJabSideWali);
		
		JLabel lblJabShelwarWali = new JLabel("Jab Shelwar wali");
		lblJabShelwarWali.setForeground(Color.WHITE);
		lblJabShelwarWali.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblJabShelwarWali.setBounds(400, 329, 150, 22);
		frame.getContentPane().add(lblJabShelwarWali);
		
		JCheckBox kef_check = new JCheckBox("Keff");
		kef_check.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		kef_check.setBounds(584, 124, 20, 23);
		frame.getContentPane().add(kef_check);
		
		JCheckBox bazo_check = new JCheckBox("");
		bazo_check.setBounds(583, 163, 21, 23);
		frame.getContentPane().add(bazo_check);
		
		JCheckBox bazo_gol_check = new JCheckBox("");
		bazo_gol_check.setBounds(583, 192, 21, 23);
		frame.getContentPane().add(bazo_gol_check);
		
		JCheckBox collar_ki_nok_check = new JCheckBox("");
		collar_ki_nok_check.setBounds(583, 218, 21, 23);
		frame.getContentPane().add(collar_ki_nok_check);
		
		JCheckBox jab_smanai_check = new JCheckBox("");
		jab_smanai_check.setBounds(583, 251, 21, 23);
		frame.getContentPane().add(jab_smanai_check);
		
		JCheckBox jab_side_check = new JCheckBox("");
		jab_side_check.setBounds(583, 295, 21, 23);
		frame.getContentPane().add(jab_side_check);
		
		JCheckBox shelwar_jab_check = new JCheckBox("");
		shelwar_jab_check.setBounds(583, 328, 21, 23);
		frame.getContentPane().add(shelwar_jab_check);
		
		JComboBox silai_cb = new JComboBox();
		silai_cb.setForeground(Color.BLACK);
		silai_cb.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		silai_cb.addItem("Double Silai");
		silai_cb.addItem("Single Silai");
		silai_cb.addItem("Full Silai");
		silai_cb.setSelectedItem("Single Silai");
		
		silai_cb.setBounds(404, 374, 136, 29);
		frame.getContentPane().add(silai_cb);
		
		JComboBox collar_style_cb = new JComboBox();
		collar_style_cb.setForeground(Color.BLACK);
		collar_style_cb.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		collar_style_cb.addItem("Bain");
		collar_style_cb.addItem("Callor");
		collar_style_cb.addItem("Bain Half");
		collar_style_cb.setSelectedItem("Callor");
		collar_style_cb.setBounds(404, 418, 136, 29);
		frame.getContentPane().add(collar_style_cb);
		
		JLabel phone = new JLabel("Phone #");
		phone.setForeground(Color.WHITE);
		phone.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		phone.setBounds(33, 461, 119, 33);
		frame.getContentPane().add(phone);
		
		phonetxt = new JTextField();
		phonetxt.setToolTipText("0335-120****\r\n");
		phonetxt.setHorizontalAlignment(SwingConstants.CENTER);
		phonetxt.setForeground(Color.WHITE);
		phonetxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		phonetxt.setColumns(10);
		phonetxt.setBackground(Color.BLACK);
		phonetxt.setBounds(196, 457, 160, 28);
		frame.getContentPane().add(phonetxt);
		
		JLabel id = new JLabel("ID");
		id.setForeground(Color.WHITE);
		id.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		id.setBounds(404, 461, 59, 33);
		frame.getContentPane().add(id);
		
		idtxt = new JTextField();
		idtxt.setHorizontalAlignment(SwingConstants.CENTER);
		idtxt.setForeground(Color.WHITE);
		idtxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		idtxt.setColumns(10);
		idtxt.setBackground(Color.BLACK);
		idtxt.setBounds(457, 462, 97, 28);
		frame.getContentPane().add(idtxt);
		
		frame.setTitle("Clothes");
		
		JLabel address = new JLabel("Address");
		address.setForeground(Color.WHITE);
		address.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		address.setBounds(33, 505, 119, 33);
		frame.getContentPane().add(address);
		
		addresstxt = new JTextField();
		addresstxt.setToolTipText("0335-120****\r\n");
		addresstxt.setHorizontalAlignment(SwingConstants.CENTER);
		addresstxt.setForeground(Color.WHITE);
		addresstxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		addresstxt.setColumns(10);
		addresstxt.setBackground(Color.BLACK);
		addresstxt.setBounds(196, 503, 333, 28);
		frame.getContentPane().add(addresstxt);
		
		JLabel lembail = new JLabel("Lembai (Length)");
		lembail.setForeground(Color.WHITE);
		lembail.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lembail.setBounds(33, 109, 150, 33);
		frame.getContentPane().add(lembail);
		
		lembaitxt = new JTextField();
		lembaitxt.setHorizontalAlignment(SwingConstants.CENTER);
		lembaitxt.setForeground(Color.WHITE);
		lembaitxt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lembaitxt.setColumns(10);
		lembaitxt.setBackground(Color.BLACK);
		lembaitxt.setBounds(259, 114, 97, 28);
		frame.getContentPane().add(lembaitxt);
		
		JButton save = new JButton("Save");
		save.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean done = false ;
				
				if(nametxt.getText().trim().isEmpty() || bazotxt.getText().trim().isEmpty() || lembaitxt.getText().trim().isEmpty() || theratxt.getText().trim().isEmpty() || shelwartxt.getText().trim().isEmpty() || shelwarkuhlitxt.getText().trim().isEmpty() || paanchatxt.getText().trim().isEmpty() || collartxt.getText().trim().isEmpty() || kamertxt.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "text field is empty...");
				}
				else
				{
				try
				{
				
					
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				
				 
					con = DriverManager.getConnection("jdbc:ucanaccess://E:\\TailorData.accdb");
						
				
				String query = "INSERT Into data (Name,Lembai,Bazo,Thera,Collar,Kamer,Shelwar,Paancha,ShelwarLoose,Phone,Address,RecordID,Keff,BazoGolKinary,BazoGol_Pati,CollarKiNok,JabSamnayWali,JabSideWali,JabShelwarWali,Silay,CollarStyle) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				pst = con.prepareStatement(query);
			//	
				pst.setString(1, nametxt.getText());
				pst.setInt(2, Integer.parseInt( lembaitxt.getText()));
				pst.setInt(3,  Integer.parseInt(bazotxt.getText()));
				pst.setInt(4,  Integer.parseInt(theratxt.getText()));
				pst.setInt(5,  Integer.parseInt(collartxt.getText()));
//				
				pst.setInt(6,  Integer.parseInt(kamertxt.getText()));
				pst.setInt(7,  Integer.parseInt(shelwartxt.getText()));
				pst.setInt(8,  Integer.parseInt(paanchatxt.getText()));
				pst.setInt(9,  Integer.parseInt(shelwarkuhlitxt.getText()));
				pst.setString(10, phonetxt.getText());
				pst.setString(11, addresstxt.getText());
				pst.setString(12,idtxt.getText());
				if(kef_check.isSelected())
				{
					pst.setString(13, "Yes");
				}
				else
				{
					pst.setString(13, "No");
				}
				if(bazo_check.isSelected())
				{
					pst.setString(14, "Yes");
				}
				else
				{
					pst.setString(14, "No");
				}
				if(bazo_gol_check.isSelected())
				{
					pst.setString(15, "Yes");
				}
				else
				{
					pst.setString(15, "No");
				}
				if(collar_ki_nok_check.isSelected())
				{
					pst.setString(16, "Yes");
				}
				else
				{
					pst.setString(16, "No");
				}
				if(jab_smanai_check.isSelected())
				{
					pst.setString(17, "Yes");
				}
				else
				{
					pst.setString(17, "No");
				}
				if(jab_side_check.isSelected())
				{
					pst.setString(18, "Yes");
				}
				else
				{
					pst.setString(18, "No");
				}
				if(shelwar_jab_check.isSelected())
				{
					pst.setString(19, "Yes");
				}
				else
				{
					pst.setString(19, "No");
				}
				pst.setString(20, silai_cb.getSelectedItem()+"");
				
				pst.setString(21, collar_style_cb.getSelectedItem()+"");
	
				pst.executeUpdate();
				done = true;
				JOptionPane.showMessageDialog(null, "Record inserted successfully...");
			
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(null, "PLEAS ENTER NUMBERS...");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				if(done == false)
				{
					JOptionPane.showMessageDialog(null, "please change the id ...");
				}
				}
			}
		});
		save.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		save.setForeground(new Color(255, 255, 240));
		save.setBackground(new Color(0, 0, 139));
		save.setBounds(599, 549, 85, 33);
		frame.getContentPane().add(save);
		frame.setTitle("Clothes Measurments");
		
		JButton back_button = new JButton("Back");
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondPage obj = new secondPage();
				frame.dispose();
			}
		});
		back_button.setForeground(new Color(255, 255, 240));
		back_button.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		back_button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		back_button.setBackground(new Color(0, 0, 139));
		back_button.setBounds(33, 549, 85, 33);
		frame.getContentPane().add(back_button);
		
		JLabel label = new JLabel("");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\eclipse-workspace\\TailorMaster\\Images\\photo-1497997092403-f091fcf5b6c4.jpg"));
		label.setBounds(0, 57, 706, 531);
		frame.getContentPane().add(label);
		frame.setVisible(true);
		frame.setResizable(false);
		
		

		
		
		
		//////////////////////////////////////////////////////////////////////////
	}
}
