import java.sql.*;
public class UpdateProduct {
	public static void main(String[]args)throws Exception {
		update();
		
	}
	
	    public static void update()throws Exception {
	    	String url = "jdbc:mysql://127.0.0.1:3306/iphone";
	    	String username = "root";
	    	String password = "Gokul@123";
	    	String query = "update spec set iphone_price = '65000' where iphone_model =   iphone 14";
	    	Connection con = DriverManager.getConnection(url, username, password);
	    	PreparedStatement pst = con.prepareStatement(query);
	    	pst.executeUpdate();
	    	con.close();
	    }
}


