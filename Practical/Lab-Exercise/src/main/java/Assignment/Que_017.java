package Assignment;

// Question: Implement a login system in JSP and servlet that uses cookies and session tracking to manage user authentication.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Que_017")
public class Que_017 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Simple authentication
		if ("admin".equals(username) && "1234".equals(password)) {

			// Create session
			HttpSession session = request.getSession();
			session.setAttribute("user", username);

			// Create cookie
			Cookie cookie = new Cookie("username", username);
			cookie.setMaxAge(60 * 60); // 1 hour
			response.addCookie(cookie);

			response.sendRedirect("Que_017_Dashboard.jsp");

		} else {

			out.println("<h3 style='color:red'>Invalid Login!</h3>");
			out.println("<a href='Que_017_Login.jsp'>Try Again</a>");
		}
	}
}
