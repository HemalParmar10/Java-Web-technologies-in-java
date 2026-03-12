// Question 5: Write a simple Java servlet that accepts parameters from a user and displays a response.

package Assignment;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Que_005")
public class Que_005 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get parameters from form
		String name = request.getParameter("username");
		String age = request.getParameter("age");

		// Set content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Display user response
		out.println("<html><body>");
		out.println("<h2>User Details Received:</h2>");
		out.println("<p><b>Name:</b> " + name + "</p>");
		out.println("<p><b>Age:</b> " + age + "</p>");
		out.println("</body></html>");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Redirect GET requests to the form
		response.sendRedirect("userInputForm.html");
	}
}