package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SaveData {
	public SaveData()
	{
		
		
		//Clothes obj = new Clothes();
		
		
		
		Connection con;
		ResultSet rs ;
		Statement st;
		PreparedStatement pst ;
		
		
		try
		{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		
		 con = DriverManager.getConnection("jdbc:ucanaccess://D:\\TailorDataTable.accdb");
		
		
	//	st = con.createStatement();
	//	
	//	ResultSet rs = st.executeQuery("Select * From Clothes");
	//	
	//	while(rs.next())
	//	{
	//		JOptionPane.showMessageDialog(null, rs.getString(2));
	//	}
	//	
		
		
		
		
		
		
		//String query = "INSERT INTO Clothes ([Name], [Lembai], [Bazo]) VALUES ('"+"lAMBO"+"', '"+22+"', '"+45+"',)";
		
		String query = "INSERT Into data values (Name,Lembai,Bazo,Thera,Collar,Kamer,Shelwar,Paancha,ShelwarLoose,Phone,Address,RecordID,Keff,BazoGolKinary,BazoGol_Pati,CollarKiNok,JabSamnayWali,JabSideWali,JabShelwarWali,Silay,CollarStyle) (?,?,?)";
		pst = con.prepareStatement(query);
	//	
		pst.setInt(1, 1);
		pst.setString(2, "nAJEEV");
		pst.setInt(3, 35);
		
////////////////////////////////////////////////////////////////////
//		String name = nametxt.getText();
//		int bazo = Integer.parseInt(bazotxt.getText());
//		int thera = Integer.parseInt(theratxt.getText());


		
		
/////////////////////////////////////////////////////////
		pst.executeUpdate();
		System.out.println("Record inseted successfully...");
	//	Statement st = con.createStatement();
	//	
	//	String sql = "DELETE FROM Clothes " +
	//               "WHERE id = 1";
	//	st.executeUpdate(sql);
	//	
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
						
}
