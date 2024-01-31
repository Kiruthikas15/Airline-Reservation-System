

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;

public class logincheck {
String email,password;
static String dbUrl="jdbc:mysql://localhost:3306/ngpdb";
static String dbUname="root";
static String dbPassword="";
static String dbDriver="com.mysql.cj.jdbc.Driver";
logincheck(String email,String password){
	
	this.password=password;
	this.email=email;
	
}
public boolean check() {
	Connection con = null;
		try {
		Class.forName(dbDriver);  //class not found exception
		con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception

//		String sql = "insert into signup(email,password)"
//				+ "values('"+email+"','"+password+"')";
		String sql = "SELECT * FROM signup WHERE email = ? AND password = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, password);

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