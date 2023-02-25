package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;




public class ShowData {

	private JFrame frame;
	private JTextField input;
	
	
	Connection con;
	ResultSet rs ;
	Statement st;
	PreparedStatement pst ;
	private JLabel lblSearchMeasurements;
	private JLabel warning;
	
	public String nam ,address, phone;
	public int lembai , bazo , thera , collar , pancha ,kamer , shelwar , shelwarkuhi , id;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			ShowData window = new ShowData();
			window.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public ShowData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(300,20, 809, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		input = new JTextField();
		input.setHorizontalAlignment(SwingConstants.CENTER);
		//input.setToolTipText("Find record by name");
		input.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		input.setForeground(Color.BLACK);
		input.setBackground(Color.WHITE);
		input.setBounds(103, 59, 336, 33);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		
		
		JButton search_name = new JButton("Find By Name\r\n");
		
		search_name.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		search_name.setForeground(Color.WHITE);
		search_name.setBackground(new Color(0, 0, 139));
		search_name.setToolTipText("Find record by name\r\n");
		search_name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		search_name.setBounds(591, 60, 150, 32);
		frame.getContentPane().add(search_name);
		
		JButton search_id = new JButton("Find By ID");
		
		search_id.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		search_id.setForeground(Color.WHITE);
		search_id.setBackground(new Color(0, 0, 139));
		search_id.setToolTipText("Find record by name\r\n");
		search_id.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		search_id.setBounds(449, 60, 128, 32);
		frame.getContentPane().add(search_id);
		
		lblSearchMeasurements = new JLabel("Search Measurement");
		lblSearchMeasurements.setForeground(Color.WHITE);
		lblSearchMeasurements.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblSearchMeasurements.setBounds(323, 11, 236, 26);
		frame.getContentPane().add(lblSearchMeasurements);
		
		warning = new JLabel("");
		warning.setForeground(Color.RED);
		warning.setBounds(128, 92, 116, 14);
		frame.getContentPane().add(warning);
		
		JLabel label = new JLabel("Address");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label.setBounds(10, 581, 119, 33);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Phone #");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_1.setBounds(10, 537, 119, 33);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Shelwar Loose");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_2.setBounds(10, 493, 139, 33);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Paancha(Knee waist)");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_3.setBounds(10, 449, 183, 33);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Shelwar");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_4.setBounds(10, 405, 85, 33);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Kamer (Waist)");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_5.setBounds(10, 361, 139, 33);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Collar length");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_6.setBounds(10, 317, 119, 33);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Thera(Shoulder)");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_7.setBounds(10, 273, 139, 33);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Bazo(Arm length)");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_8.setBounds(10, 229, 150, 33);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Lembai (Length)");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_9.setBounds(10, 185, 150, 33);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Name");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_10.setBounds(10, 141, 85, 33);
		frame.getContentPane().add(label_10);
		
		JLabel address_lbl = new JLabel("");
		address_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		address_lbl.setForeground(Color.WHITE);
		address_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		address_lbl.setBounds(128, 581, 371, 33);
		frame.getContentPane().add(address_lbl);
		
		JLabel phone_lbl = new JLabel("");
		phone_lbl.setForeground(Color.WHITE);
		phone_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		phone_lbl.setBounds(214, 537, 119, 33);
		frame.getContentPane().add(phone_lbl);
		
		JLabel shelwarkuhli_lbl = new JLabel("");
		shelwarkuhli_lbl.setForeground(Color.WHITE);
		shelwarkuhli_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		shelwarkuhli_lbl.setBounds(214, 493, 139, 33);
		frame.getContentPane().add(shelwarkuhli_lbl);
		
		JLabel paancha_lbl = new JLabel("");
		paancha_lbl.setForeground(Color.WHITE);
		paancha_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		paancha_lbl.setBounds(214, 449, 158, 33);
		frame.getContentPane().add(paancha_lbl);
		
		JLabel shelwar_lbl = new JLabel("");
		shelwar_lbl.setForeground(Color.WHITE);
		shelwar_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		shelwar_lbl.setBounds(214, 405, 98, 33);
		frame.getContentPane().add(shelwar_lbl);
		
		JLabel kamer_lbl = new JLabel("");
		kamer_lbl.setForeground(Color.WHITE);
		kamer_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		kamer_lbl.setBounds(214, 361, 139, 33);
		frame.getContentPane().add(kamer_lbl);
		
		JLabel coller_lbl = new JLabel("");
		coller_lbl.setForeground(Color.WHITE);
		coller_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		coller_lbl.setBounds(214, 317, 119, 33);
		frame.getContentPane().add(coller_lbl);
		
		JLabel thera_lbl = new JLabel("");
		thera_lbl.setForeground(Color.WHITE);
		thera_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		thera_lbl.setBounds(214, 273, 139, 33);
		frame.getContentPane().add(thera_lbl);
		
		JLabel bazo_lbl = new JLabel("");
		bazo_lbl.setForeground(Color.WHITE);
		bazo_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		bazo_lbl.setBounds(214, 229, 150, 33);
		frame.getContentPane().add(bazo_lbl);
		
		JLabel lembai_lbl = new JLabel("");
		lembai_lbl.setForeground(Color.WHITE);
		lembai_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lembai_lbl.setBounds(214, 185, 150, 33);
		frame.getContentPane().add(lembai_lbl);
		
		JLabel name_lbl = new JLabel("");
		name_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		name_lbl.setForeground(Color.WHITE);
		name_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		name_lbl.setBounds(138, 141, 279, 33);
		frame.getContentPane().add(name_lbl);
		
		JLabel label_11 = new JLabel("ID");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		label_11.setBounds(10, 611, 59, 33);
		frame.getContentPane().add(label_11);
		
		JLabel id_lbl = new JLabel("");
		id_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		id_lbl.setForeground(Color.WHITE);
		id_lbl.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		id_lbl.setBounds(214, 607, 119, 33);
		frame.getContentPane().add(id_lbl);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\eclipse-workspace\\TailorMaster\\Images\\rm28-wood-aom-133_2.jpg"));
		lblNewLabel_1.setBounds(0, 0, 793, 130);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblKeff = new JLabel("Keff");
		lblKeff.setForeground(Color.WHITE);
		lblKeff.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblKeff.setBounds(450, 141, 85, 33);
		frame.getContentPane().add(lblKeff);
		
		JLabel lblBazoGolKinari = new JLabel("Bazo Gol Kinari");
		lblBazoGolKinari.setForeground(Color.WHITE);
		lblBazoGolKinari.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblBazoGolKinari.setBounds(450, 185, 150, 33);
		frame.getContentPane().add(lblBazoGolKinari);
		
		JLabel lblBazoGolPatti = new JLabel("Bazo Gol Patti");
		lblBazoGolPatti.setForeground(Color.WHITE);
		lblBazoGolPatti.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblBazoGolPatti.setBounds(450, 229, 150, 33);
		frame.getContentPane().add(lblBazoGolPatti);
		
		JLabel lblCollarKiNok = new JLabel("Collar Ki Nok");
		lblCollarKiNok.setForeground(Color.WHITE);
		lblCollarKiNok.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblCollarKiNok.setBounds(450, 273, 150, 33);
		frame.getContentPane().add(lblCollarKiNok);
		
		JLabel lblJabSamnayWali = new JLabel("Jab Samnay wali");
		lblJabSamnayWali.setForeground(Color.WHITE);
		lblJabSamnayWali.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblJabSamnayWali.setBounds(450, 328, 150, 33);
		frame.getContentPane().add(lblJabSamnayWali);
		
		JLabel lblJabSideWali = new JLabel("Jab Side wali");
		lblJabSideWali.setForeground(Color.WHITE);
		lblJabSideWali.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblJabSideWali.setBounds(450, 372, 150, 33);
		frame.getContentPane().add(lblJabSideWali);
		
		JLabel lblJabShelwarWali = new JLabel("Jab Shelwar wali");
		lblJabShelwarWali.setForeground(Color.WHITE);
		lblJabShelwarWali.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblJabShelwarWali.setBounds(450, 416, 150, 33);
		frame.getContentPane().add(lblJabShelwarWali);
		
		JLabel lblSilai = new JLabel("Silai");
		lblSilai.setForeground(Color.WHITE);
		lblSilai.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblSilai.setBounds(450, 460, 150, 33);
		frame.getContentPane().add(lblSilai);
		
		JLabel lblCollarStyle = new JLabel("Collar Style");
		lblCollarStyle.setForeground(Color.WHITE);
		lblCollarStyle.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		lblCollarStyle.setBounds(450, 493, 150, 33);
		frame.getContentPane().add(lblCollarStyle);
		
		JLabel keff_output = new JLabel("");
		keff_output.setForeground(Color.WHITE);
		keff_output.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		keff_output.setBounds(598, 141, 85, 33);
		frame.getContentPane().add(keff_output);
		
		JLabel bazo_GKinari_output = new JLabel("");
		bazo_GKinari_output.setForeground(Color.WHITE);
		bazo_GKinari_output.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		bazo_GKinari_output.setBounds(598, 185, 85, 33);
		frame.getContentPane().add(bazo_GKinari_output);
		
		JLabel bazo_patti_o = new JLabel("");
		bazo_patti_o.setForeground(Color.WHITE);
		bazo_patti_o.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		bazo_patti_o.setBounds(598, 229, 85, 33);
		frame.getContentPane().add(bazo_patti_o);
		
		JLabel collar_nok_out = new JLabel("");
		collar_nok_out.setForeground(Color.WHITE);
		collar_nok_out.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		collar_nok_out.setBounds(598, 273, 85, 33);
		frame.getContentPane().add(collar_nok_out);
		
		JLabel jab_samnay_out = new JLabel("");
		jab_samnay_out.setForeground(Color.WHITE);
		jab_samnay_out.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		jab_samnay_out.setBounds(598, 328, 85, 33);
		frame.getContentPane().add(jab_samnay_out);
		
		JLabel jab_side_out = new JLabel("");
		jab_side_out.setForeground(Color.WHITE);
		jab_side_out.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		jab_side_out.setBounds(598, 372, 85, 33);
		frame.getContentPane().add(jab_side_out);
		
		JLabel jab_shelwar_out = new JLabel("");
		jab_shelwar_out.setForeground(Color.WHITE);
		jab_shelwar_out.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		jab_shelwar_out.setBounds(598, 416, 85, 33);
		frame.getContentPane().add(jab_shelwar_out);
		
		JLabel silai_out = new JLabel("");
		silai_out.setForeground(Color.WHITE);
		silai_out.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		silai_out.setBounds(598, 460, 163, 33);
		frame.getContentPane().add(silai_out);
		
		JLabel Collar_stle_out = new JLabel("");
		Collar_stle_out.setForeground(Color.WHITE);
		Collar_stle_out.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		Collar_stle_out.setBounds(598, 493, 163, 33);
		frame.getContentPane().add(Collar_stle_out);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondPage obj = new secondPage();
				frame.dispose();
			}
		});
		button.setForeground(new Color(255, 255, 240));
		button.setFont(new Font("Modern No. 20", Font.PLAIN, 22));
		button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setBackground(new Color(0, 0, 139));
		button.setBounds(687, 611, 85, 33);
		frame.getContentPane().add(button);
		frame.setResizable(false);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("C:\\Users\\Irfan ullah BSCS-II\\eclipse-workspace\\TailorMaster\\Images\\rm28-wood-aom-017_2.jpg"));
		label_12.setBounds(0, 130, 793, 521);
		frame.getContentPane().add(label_12);
		frame.setVisible(true);
		
		
		search_id.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(input.getText().trim().isEmpty())
				{
					warning.setText("TextField is empty ...");
				}
				else
				{
					
					String id = input.getText();
					boolean found = false ;
						try
						{
						Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
						
						con = DriverManager.getConnection("jdbc:ucanaccess://E:\\TailorData.accdb");
					
						
						st = con.createStatement();
						
						ResultSet rs = st.executeQuery("Select * from data");
						
						while(rs.next())
						{
							
							String idd= rs.getString(12);
							if(idd.equalsIgnoreCase(id))
							{
								nam = rs.getString(1);
								name_lbl.setText(nam);
								lembai = rs.getInt(2);
								lembai_lbl.setText(lembai+"");
								bazo = rs.getInt(3);
								bazo_lbl.setText(bazo+"");
								thera = rs.getInt(4);
								thera_lbl.setText(thera+"");
								collar = rs.getInt(5);
								coller_lbl.setText(collar+"");
								kamer = rs.getInt(6);
								kamer_lbl.setText(""+kamer);
								
								shelwar = rs.getInt(7);
								shelwar_lbl.setText(""+shelwar);
								pancha = rs.getInt(8);
								paancha_lbl.setText(pancha+"");
								
								shelwarkuhi = rs.getInt(9);
								shelwarkuhli_lbl.setText(""+shelwarkuhi);
								phone = rs.getString(10);
								phone_lbl.setText(phone);
								address = rs.getString(11);
								address_lbl.setText(address);
								id = rs.getString(12);
								id_lbl.setText(id+"");
								
								keff_output.setText(rs.getString(13));
								bazo_GKinari_output.setText(rs.getString(14));
								bazo_patti_o.setText(rs.getString(15));
								
								collar_nok_out.setText(rs.getString(16));
								jab_samnay_out.setText(rs.getString(17));
								jab_shelwar_out.setText(rs.getString(18));
								jab_side_out.setText(rs.getString(19));
								
								silai_out.setText(rs.getString(20));
								Collar_stle_out.setText(rs.getString(21));
								
								found = true; 
							
								
								
							}
							
						}
						 if(found == false)
						 {
							 JOptionPane.showMessageDialog(null, "No records found ...");
						 }
						 else
						 {
							
						 }
						
						
						
						
						
						}
						catch(Exception e )
						{
							System.out.println(e);
						}
				
				
			}}
		});
		
		
		search_name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(input.getText().trim().isEmpty())
				{
					warning.setText("TextField is empty ...");
				}
				else
				{
					
					String name = input.getText();
					boolean found = false ;
						try
						{
						Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
						
						con = DriverManager.getConnection("jdbc:ucanaccess://E:\\TailorData.accdb");
					
						
						st = con.createStatement();
						//ResultSet rs = st.executeQuery("Select * from data where name = '"+name+"'");
						
						ResultSet rs = st.executeQuery("Select * from data");
						
						while(rs.next())
						{
							
							String namee = rs.getString(1);
							if(namee.equalsIgnoreCase(name))
							{
								nam = rs.getString(1);
								name_lbl.setText(nam);
								lembai = rs.getInt(2);
								lembai_lbl.setText(lembai+"");
								bazo = rs.getInt(3);
								bazo_lbl.setText(bazo+"");
								thera = rs.getInt(4);
								thera_lbl.setText(thera+"");
								collar = rs.getInt(5);
								coller_lbl.setText(collar+"");
								kamer = rs.getInt(6);
								kamer_lbl.setText(""+kamer);
								
								shelwar = rs.getInt(7);
								shelwar_lbl.setText(""+shelwar);
								pancha = rs.getInt(8);
								paancha_lbl.setText(pancha+"");
								
								shelwarkuhi = rs.getInt(9);
								shelwarkuhli_lbl.setText(""+shelwarkuhi);
								phone = rs.getString(10);
								phone_lbl.setText(phone+"");
								address = rs.getString(11);
								address_lbl.setText(address);
								id = rs.getInt(12);
								id_lbl.setText(id+"");
								
								keff_output.setText(rs.getString(13));
								bazo_GKinari_output.setText(rs.getString(14));
								bazo_patti_o.setText(rs.getString(15));
								
								collar_nok_out.setText(rs.getString(16));
								jab_samnay_out.setText(rs.getString(17));
								jab_shelwar_out.setText(rs.getString(18));
								jab_side_out.setText(rs.getString(19));
								
								silai_out.setText(rs.getString(20));
								Collar_stle_out.setText(rs.getString(21));
								
								found = true ;
								
							}
							
						}
						if(found == false)
						 {
							 JOptionPane.showMessageDialog(null, "No records found ...");
						 }
						 else
						 {
							
						 }
						
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
				
				
			}}
		});
	
	}
	
}
