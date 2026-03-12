package Assignment;

// (This servlet retrieves data from ServletContext)

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetData")
public class Que_013_GetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletContext context = getServletContext();

		// Getting shared data
		String company = (String) context.getAttribute("companyName");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h2>Data Retrieved from ServletContext</h2>");
		out.println("<p>Company Name: " + company + "</p>");
	}
}
