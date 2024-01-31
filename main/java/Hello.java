//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hello {
String name,password,email,phone_no;
static String dbUrl="jdbc:mysql://localhost:3306/ngpdb";
static String dbUname="root";
static String dbPassword="";
static String dbDriver="com.mysql.cj.jdbc.Driver";
Hello(String name,String password,String email,String phone_no){
	this.name=name;
	this.password=password;
	this.email=email;
	this.phone_no=phone_no;
}
void store() {
	Connection con = null;
		try {
		Class.forName(dbDriver);  //class not found exception
		con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception

		String sql = "insert into student_table (name,password,email,phone_no)"
				+ "values('"+name+"','"+password+"','"+email+"','"+phone_no+"')";
		   // String sql="select * from student";
		Statement s =  con.createStatement();
		s.execute(sql);
//	   	ResultSet rs=executeQuery(sql);
//	   	while(rs.next()) {
//	   		System.out.println(rs.getString(1));
//	   	}
	   	con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	 
}

}
