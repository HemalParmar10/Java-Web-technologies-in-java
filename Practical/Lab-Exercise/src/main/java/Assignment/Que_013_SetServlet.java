package Assignment;

/*
 Question 13: Use ServletContext to share data across multiple servlets.
 (This servlet sets data in ServletContext)
*/

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetData")
public class Que_013_SetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext context = getServletContext();

		// Setting data in application scope
		context.setAttribute("companyName", "Tech Solutions Pvt Ltd");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Data Stored in ServletContext Successfully!</h2>");
		out.println("<a href='GetData'>Go to Second Servlet</a>");
	}
}
