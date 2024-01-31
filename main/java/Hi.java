
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hi {
String email,password;
static String dbUrl="jdbc:mysql://localhost:3306/ngpdb";
static String dbUname="root";
static String dbPassword="";
static String dbDriver="com.mysql.cj.jdbc.Driver";
Hi(String email,String password){
	
	this.password=password;
	this.email=email;
	
}
void validate() {
	Connection con = null;
		try {
		Class.forName(dbDriver);  //class not found exception
		con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception

		String sql = "insert into signup(email,password)"
				+ "values('"+email+"','"+password+"')";
		//String sql="select * from signup";
		Statement s =  con.createStatement();
		s.execute(sql);
//	   ResultSet rs=executeQuery(sql);
//	   	while(rs.next()) {
//	   		System.out.println(rs.getString(1));
//	   	}
	   	con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
}

}
