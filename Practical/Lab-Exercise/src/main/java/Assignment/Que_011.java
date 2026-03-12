package Assignment;

// Question 11: Write a servlet that uses ServletConfig to fetch initialization parameters.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Que_011 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String username;
	private String email;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		// Fetching initialization parameters from web.xml
		username = config.getInitParameter("username");
		email = config.getInitParameter("email");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h2>ServletConfig Example</h2>");
		out.println("<p>Username: " + username + "</p>");
		out.println("<p>Email: " + email + "</p>");
	}
}
