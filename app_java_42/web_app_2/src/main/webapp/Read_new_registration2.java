package p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class Read_new_registration2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Read_new_registration2() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// required jdbc driver file for tomcat to run it
			Class.forName("com.mysql.jdbc.Driver");
			// Connect to DB
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_2", "root", "test");

			// create Statements
			Statement stmnt = con.createStatement();

			// reading table i.e. FROM SERVLET TO HTML
			ResultSet result = stmnt.executeQuery("Select * from student");

			PrintWriter out = response.getWriter();

			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<th>");
			out.println("Name");
			out.println("</th>");
			out.println("<th>");
			out.println("City");
			out.println("</th>");
			out.println("<th>");
			out.println("Email");
			out.println("</th>");
			out.println("<th>");
			out.println("Mobile");
			out.println("</th>");
			out.println("</tr>");

			while (result.next()) {

				out.println("<tr>");
				out.println("<td>");
				out.println(result.getString(1));
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(2));
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(3));
				out.println("</td>");
				out.println("<td>");
				out.println(result.getString(4));
				out.println("</td>");
				out.println("</tr>");
			}	

			out.println("</table>");	
			
			
			
			// Close DB connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
