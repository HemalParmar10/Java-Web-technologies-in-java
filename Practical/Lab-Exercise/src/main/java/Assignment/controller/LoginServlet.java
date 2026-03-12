package Assignment.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import Assignment.dao.UserDAO;
import Assignment.model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDAO dao = new UserDAO();

		User user = dao.loginUser(username, password);

		if (user != null) {

			HttpSession session = request.getSession();
			session.setAttribute("user", user);

			response.sendRedirect("profile.jsp");

		} else {

			response.sendRedirect("login.jsp");
		}
	}
}
