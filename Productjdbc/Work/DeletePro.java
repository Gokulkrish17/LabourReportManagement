import java.sql.*;
public class DeletePro {

	public static void main(String[]args)throws Exception {
		delete();
		
	}
	
	    public static void delete()throws Exception {
	    	String url = "jdbc:mysql://127.0.0.1:3306/iphone";
	    	String username = "root";
	    	String password = "Gokul@123";
	    	String query = "delete spec colour where model=iphone 14";
	    	Connection con = DriverManager.getConnection(url, username, password);
	    	PreparedStatement pst = con.prepareStatement(query);
	    	pst.executeUpdate();
	    	con.close();
	    }
}

