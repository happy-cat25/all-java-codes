package jdbc_app_2;

//creating connection to mysql DB and creating table and adding values in it.
//performing different set of operations on data present in table in Mysql Query test_db_1.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {
	public static void main(String[] args) {
		try {
			// Connect to DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_1", "root", "test");
			System.out.println(con);

			// create Statements
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into student values ('frank','seattle','frank@gmail.com','4655520');");
			stmnt.executeUpdate("insert into student values ('jenny','houston','jenny34@gmail.com','6584621');");
			stmnt.executeUpdate("insert into student values ('pranay','paris','pranay25@gmail.com','32427652');");
			// command to create a record in a table
			// Close DB connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
