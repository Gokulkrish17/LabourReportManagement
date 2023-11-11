import  java.sql.*;
public class LabourReport {

	public static void main(String[]args)throws Exception {
	insert();	
	}
	
	public static void insert()throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/LabourReport";
		String username = "root";
		String password = "Gokul@123";
		String query = "insert into Schedule values (? , ? , ? , ? , ? , ?)";
		Connection con = DriverManager.getConnection(url, username, password);
    	PreparedStatement pst = con.prepareStatement(query);
    	pst.setInt(1, 005 );
    	pst.setString(2,"Kumaran" );
    	pst.setInt(3, 25 );
    	pst.setString(4,"8 Hours" );
    	pst.setInt(5, 15000 );
    	pst.setLong(6, 6381245881l);
    	pst.executeUpdate();
    	con.close();
	}
}
