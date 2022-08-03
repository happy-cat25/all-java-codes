package p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final PrintWriter out = null;

	public Registration() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       
        //WRITING BACK SERVLET TO HTML IN GET 
         PrintWriter out = response.getWriter();
         out.println("<h1>");
         out.println("Put your name in that box");
         out.println("</h1>");
         out.println("name:<input type='text' name='name'/>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         System.out.println("post");
	}

}
