package Assignment;

// Question 12: Create a login form in JSP, send the data to a servlet, and use RequestDispatcher to forward or include a response based on input validity.

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class Que_012 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// Simple validation (Hardcoded for demo)
		if ("admin".equals(username) && "1234".equals(password)) {

			// Forward to Success.jsp
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);

		} else {

			// Include login page again with error message
			response.getWriter().println("<h3 style='color:red'>Invalid Credentials!</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	}
}
