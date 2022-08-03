package jdbc_app_2;

//creating connection to mysql DB and creating table and updating values in it.
//performing different set of operations on data present in table in Mysql Query test_db_1.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class C {
	public static void main(String[] args) {
		try {
			// Connect to DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_1", "root", "test");
			System.out.println(con);

			// create Statements
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("update student set mobile ='00000000' where email='pranay25@gmail.com'");
			// command to update contents in table

			// Close DB connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
