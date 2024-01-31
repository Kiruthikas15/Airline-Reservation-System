


//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;

public class paymentclass {
String name,aadhar,email,phone,flightid,departure,destination,fare;
static String dbUrl="jdbc:mysql://localhost:3306/ngpdb";
static String dbUname="root";
static String dbPassword="";
static String dbDriver="com.mysql.cj.jdbc.Driver";
paymentclass(String name,String aadhar,String email ,String phone,String flightid ,String departure,String destination,String fare){
	
	this.name=name;
	this.aadhar=aadhar;
	this.email=email;
	this.phone=phone;
	this.flightid=flightid;
	this.departure=departure;
	this.destination=destination;
	this.fare=fare;
	
	
}
public boolean paycheck() {
	Connection con = null;
		try {
		Class.forName(dbDriver);  //class not found exception
		con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception

//		String sql = "insert into signup(email,password)"
//				+ "values('"+email+"','"+password+"')";
		String sql = "SELECT * FROM signup WHERE name = ? AND aadhar = ? AND email = ? AND phone = ? AND flightid = ? AND departure = ? AND destination = ? AND fare = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, aadhar);
        ps.setString(3, email);
        ps.setString(4, phone);
        ps.setString(5, flightid);
        ps.setString(6, departure);
        ps.setString(7, destination);
        ps.setString(8, fare);

        ResultSet rs = ps.executeQuery();
        return rs.next();
		}
		catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}