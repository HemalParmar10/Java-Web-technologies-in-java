package Assignment;

// Question 9: Write a servlet program and override all life cycle methods to log messages when each method is called.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Que_009 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/*
	 * 1. init() method - Called only once when servlet is loaded into memory. -
	 * Used for initialization.
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Servlet Initialization method (init) called.");
	}

	/*
	 * 2. service() method - Called for every request. - Dispatches request to
	 * doGet(), doPost(), etc.
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Service method called.");
		super.service(request, response); // Important to call this
	}

	/*
	 * 3. doGet() method - Called for GET request.
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doGet method called.");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Check server console for lifecycle logs.</h2>");
	}

	/*
	 * 4. doPost() method - Called for POST request.
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("doPost method called.");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>POST request received. Check console logs.</h2>");
	}

	/*
	 * 5. destroy() method - Called only once when servlet is removed from memory. -
	 * Used for cleanup.
	 */
	@Override
	public void destroy() {
		System.out.println("Servlet destroy method called.");
		super.destroy();
	}
}
