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

@WebServlet("/reg")
public class create_registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public create_registration() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("emailid");
		String mobile = request.getParameter("mobile");
		
			try {
				//required jdbc driver file for tomcat to run it
				Class.forName("com.mysql.jdbc.Driver");
				// Connect to DB
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_2", "root", "test");

				// create Statements
				Statement stmnt= con.createStatement();
				
				// command to create a record in a table
				stmnt.executeUpdate("insert into student values ('"+name+"','"+city+"','"+email+"','"+mobile+"');");
				
				// Close DB connection
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


