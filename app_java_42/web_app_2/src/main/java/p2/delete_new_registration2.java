package p2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class delete_new_registration2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public delete_new_registration2() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            System.out.println("get");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("emailid");
		
			try {
				//required jdbc driver file for tomcat to run it
				Class.forName("com.mysql.jdbc.Driver");
				// Connect to DB
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_2", "root", "test");

				// create Statements
				Statement stmnt = con.createStatement();
				
				stmnt.executeUpdate("Delete from student where email='"+email+"'");
				// command to create a record in a table
				// Close DB connection
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


