import java.sql.*;

public class GetProduct {

	public static void main(String[]args)throws Exception {
		get();
		
	}
	
	    public static void get()throws Exception {
	    	String url = "jdbc:mysql://127.0.0.1:3306/iphone";
	    	String username = "root";
	    	String password = "Gokul@123";
	    	String query = "select * from spec";
	    	Connection con = DriverManager.getConnection(url, username, password);
	    	Statement st = con.createStatement();
	    	ResultSet rs = st.executeQuery(query);
	    	while(rs.next()) {
	    		System.out.println("Model is "+rs.getString(1));
	    		System.out.println("Price is "+rs.getInt(2));
	    		System.out.println("Colour is "+rs.getString(3));
	    	}
	    }
}
