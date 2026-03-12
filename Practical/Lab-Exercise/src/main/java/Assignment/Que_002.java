// Question: Create a Java servlet that displays the HTTP request headers and sends an HTTP response with custom headers.

package Assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Que_002")
public class Que_002 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Set custom response headers
		response.setHeader("X-Custom-Header", "MyCustomValue");
		response.setHeader("X-App-Version", "1.0");

		// Set content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h2>HTTP Request Headers:</h2>");
		out.println("<ul>");

		// Display all HTTP request headers
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String header = headerNames.nextElement();
			String value = request.getHeader(header);
			out.println("<li><b>" + header + ":</b> " + value + "</li>");
		}

		out.println("</ul>");
		out.println("<p>Custom headers have been sent in the response.</p>");
		out.println("</body></html>");
	}

	// Handle POST requests same as GET
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}