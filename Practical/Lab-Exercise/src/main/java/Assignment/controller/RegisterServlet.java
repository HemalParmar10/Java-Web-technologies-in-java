package Assignment.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import Assignment.dao.UserDAO;
import Assignment.model.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User user = new User();

		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);

		UserDAO dao = new UserDAO();
		dao.registerUser(user);

		response.sendRedirect("Success.jsp");
	}
}
