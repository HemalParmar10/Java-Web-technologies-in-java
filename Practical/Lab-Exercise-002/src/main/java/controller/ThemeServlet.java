package controller;

/*
 * Que-019: Cookie Implementation:
 * o Step1: Store the user’s preferences (e.g., theme) in a cookie. 
 * o Step2: On subsequent visits, read the cookie and apply the stored preferences to the web page.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/setTheme")
public class ThemeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String theme = request.getParameter("theme");

		Cookie cookie = new Cookie("themePreference", theme);

		cookie.setMaxAge(60 * 60 * 24); // 1 day

		response.addCookie(cookie);

		response.sendRedirect("home.jsp");
	}
}
