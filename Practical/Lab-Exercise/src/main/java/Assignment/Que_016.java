package Assignment;

// Question 16: Create a JSP page that uses JSTL to iterate through a list, display scriptlets, and access implicit objects.

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Que_016")
public class Que_016 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<String> subjects = new ArrayList<>();
		subjects.add("Java");
		subjects.add("Servlet");
		subjects.add("JSP");
		subjects.add("JSTL");

		request.setAttribute("subjectList", subjects);

		request.getRequestDispatcher("Que_016.jsp").forward(request, response);
	}
}
