package Assignment;

// Question 15: Implement a filter to perform server-side validation of user input.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@WebFilter("/Que_015")
public class Que_015_Filter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if (username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()) {

			out.println("<h3 style='color:red'>All fields are required!</h3>");
			out.println("<a href='userLogin.jsp'>Go Back</a>");

		} else {
			chain.doFilter(request, response);
		}
	}
}
