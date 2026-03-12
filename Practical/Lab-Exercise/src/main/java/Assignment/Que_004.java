// Question: Write a simple CGI script using Java to accept user input from a form and display it on a webpage.

package Assignment;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Que_004")
public class Que_004 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get form input values
		String name = request.getParameter("username");
		String email = request.getParameter("email");

		// Set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Display the input back to the user
		out.println("<html><body>");
		out.println("<h2>User Input Received:</h2>");
		out.println("<p><b>Name:</b> " + name + "</p>");
		out.println("<p><b>Email:</b> " + email + "</p>");
		out.println("</body></html>");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Redirect GET requests to the form
		response.sendRedirect("inputForm.html");
	}
}