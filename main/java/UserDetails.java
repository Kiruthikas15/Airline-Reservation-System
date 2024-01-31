import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDetails {
    String dbUrl = "jdbc:mysql://localhost:3306/ngpdb";
    String dbUname = "root";
    String dbPassword = "";
    String dbDriver = "com.mysql.cj.jdbc.Driver";
    String name, aadhar, email, phone, flightid, fare, departure, destination;

    UserDetails(String name, String aadhar, String email, String phone, String flightid, String fare, String departure, String destination) {
        this.name = name;
        this.aadhar = aadhar;
        this.email = email;
        this.phone = phone;
        this.flightid = flightid;
        this.fare = fare;
        this.departure = departure;
        this.destination = destination;
    }

    void user() {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            // Load the JDBC driver class
            Class.forName(dbDriver);
            // Establish a connection
            con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);

            // Prepare the SQL INSERT statement
            String sql = "INSERT INTO userandflightdetails (flightid, departure, destination, fare, name, aadhar, email, phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);

            // Set the parameters for the PreparedStatement
            pstmt.setString(1, flightid);
            pstmt.setString(2, departure);
            pstmt.setString(3, destination);
            pstmt.setString(4, fare);
            pstmt.setString(5, name);
            pstmt.setString(6, aadhar);
            pstmt.setString(7, email);
            pstmt.setString(8, phone);

            // Execute the INSERT statement
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the PreparedStatement and Connection
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
