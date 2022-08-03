package jdbc_app_2;

//creating connection to mysql DB and creating table and deleting values from it.
//performing different set of operations on data present in table in Mysql Query test_db_1.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {
	public static void main(String[] args) {
		try {
			// Connect to DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_1", "root", "test");
			System.out.println(con);

			// create Statements
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("DELETE FROM student WHERE email='jenny34@gmail.com'");
			// command for deleting record in a table

			// Close DB connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
