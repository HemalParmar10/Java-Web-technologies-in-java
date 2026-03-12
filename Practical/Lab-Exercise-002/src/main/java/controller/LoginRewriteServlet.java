package controller;

/*
 * Que-021: URL Rewriting:
 * o Step1: Implement URL rewriting to maintain the session for a user in case cookies are disabled.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/loginRewrite")
public class LoginRewriteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("admin") && password.equals("1234")) {

			response.sendRedirect("welcome_rewrite.jsp?user=" + username);

		} else {

			response.getWriter().println("Invalid Login");

		}
	}
}
