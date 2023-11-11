import java.sql.*;
public class Insertproduct {

	public static void main(String[]args)throws Exception {
		insert();
		
	}
	
	    public static void insert()throws Exception {
	    	String url = "jdbc:mysql://127.0.0.1:3306/iphone";
	    	String username = "root";
	    	String password = "Gokul@123";
	    	String query = "insert into spec values (?, ?, ?)";
	    	Connection con = DriverManager.getConnection(url, username, password);
	    	PreparedStatement pst = con.prepareStatement(query);
	    	pst.setString(1, "iphone 14");
	    	pst.setInt(2, 80000);
	    	pst.setString(3, "White");
	    	pst.executeUpdate();
	    	con.close();
	    }
}
