package Assignment;

// Question 8: Write a program using HttpServlet to handle HTTP-specific requests like GET and POST.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Que_008")
public class Que_008 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// Handling GET request
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h2>Handling GET Request</h2>");
		out.println("<p>This response is generated using doGet() method.</p>");
	}

	// Handling POST request
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h2>Handling POST Request</h2>");
		out.println("<p>This response is generated using doPost() method.</p>");
	}
}
