

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Flightclass {
    // Existing code...
	String departure,destination;
	static String dbUrl="jdbc:mysql://localhost:3306/ngpdb";
	static String dbUname="root";
	static String dbPassword="";
	static String dbDriver="com.mysql.cj.jdbc.Driver";
	Flightclass(String departure,String destination){
		
		this.departure=departure;
		this.destination=destination;
		
	}
	public List<String> getFlightDetails() {
	    List<String> flightDetails = new ArrayList<>();
	    String sql = "SELECT * FROM adminflightdetails WHERE departure = ? AND destination = ?";

	    try (Connection con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
	         PreparedStatement ps = con.prepareStatement(sql)) {
	        
	        Class.forName(dbDriver); // Modern JDBC drivers don't need this, but it can stay for compatibility.
	        ps.setString(1, departure);
	        ps.setString(2, destination);

	        try (ResultSet rs = ps.executeQuery()) {
	            if (rs.next()) {
	                flightDetails.add(rs.getString("flightID")); // Adjust column names as per your DB schema
	                flightDetails.add(rs.getString("time"));
	                flightDetails.add(rs.getString("fare"));
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return flightDetails;
	}
}
