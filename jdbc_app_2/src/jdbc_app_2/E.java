package jdbc_app_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		try {
			//for manually loading jdbc driver for tomcat to work with mysql
			Class.forName("com.mysql.jdbc.Driver");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Name:");
			String name = scan.next();
			
			System.out.println("Enter your City:");
			String city = scan.next();
			
			System.out.println("Enter your Emailid:");
			String email = scan.next();
			
			System.out.println("Enter your Mobile number:");
			String mobile = scan.next();
			
			// Connect to DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_2", "root", "test");
			System.out.println(con);

			// create Statements
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into student values ('"+name+"','"+city+"','"+email+"','"+mobile+"');");
		
			// command to create a record in a table
			// Close DB connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
