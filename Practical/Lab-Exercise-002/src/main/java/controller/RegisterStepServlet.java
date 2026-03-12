package controller;

/*
 * Que-020: Hidden Form Fields: 
 * o Step1: Create a multi-step form for user registration. 
 * o Step2: Pass data between forms using hidden fields without using sessions.
 */

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/registerStep")
public class RegisterStepServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String email = request.getParameter("email");

		request.setAttribute("username", username);
		request.setAttribute("email", email);

		RequestDispatcher rd = request.getRequestDispatcher("register_step2.jsp");

		rd.forward(request, response);
	}
}
