package jdbc_app_2;

//creating connection to mysql DB and reading values from it.
//performing different set of operations on data present in table in Mysql Query test_db_1.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class D {
	public static void main(String[] args) {
		try {
			// Connect to DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_1", "root", "test");
			System.out.println(con);

			// create Statements
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from student");
			// command to read data from table using while loop.

			while (result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));

			}
			// Close DB connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
