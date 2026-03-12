package Assignment;

// Question 7: Create a Java servlet program using both GenericServlet and HttpServlet and compare their implementation.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 ==============================
 1. Servlet using GenericServlet
 ==============================
*/

class GenericServletExample extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>This is GenericServlet Example</h2>");
        out.println("<p>GenericServlet is protocol independent.</p>");
    }
}

/*
 ==============================
 2. Servlet using HttpServlet
 ==============================
*/

class HttpServletExample extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>This is HttpServlet Example</h2>");
        out.println("<p>HttpServlet is HTTP protocol specific.</p>");
    }
}

/*
 ==============================
 Comparison Between GenericServlet and HttpServlet
 ==============================

 1. GenericServlet:
    - Belongs to jakarta.servlet package
    - Protocol independent
    - Must override service() method
    - Suitable for non-HTTP protocols

 2. HttpServlet:
    - Belongs to jakarta.servlet.http package
    - HTTP protocol specific
    - Provides doGet(), doPost(), doPut(), doDelete() methods
    - Mostly used in web applications

 3. HttpServlet extends GenericServlet.

 Conclusion:
 GenericServlet is used when we want protocol-independent servlets.
 HttpServlet is preferred for web applications because it supports HTTP methods.
*/
