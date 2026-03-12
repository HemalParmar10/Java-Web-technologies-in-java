package controller;

/*
 * Que-18: Session Management in Web Application: 
 * o Step1: Create a login page in JSP. 
 * o Step2: Use a session to track the logged-in user and display a welcome page with their details. 
 * o Step3: Implement logout functionality that invalidates the session.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/loginSession")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// simple validation
		if (username.equals("admin") && password.equals("1234")) {

			HttpSession session = request.getSession();

			session.setAttribute("user", username);

			response.sendRedirect("welcome.jsp");

		} else {

			response.getWriter().println("Invalid Login Credentials");

		}
	}
}
