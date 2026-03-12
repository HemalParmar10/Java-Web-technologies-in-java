package controller;

/*
 * Que-024: OTP Verification: 
 * o Step1: Create a registration form with an email field. 
 * o Step2: Generate an OTP upon form submission and send it to the provided email address. 
 * o Step3: Create a form to enter the OTP and verify the user’s email before allowing account creation. 
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/verifyOtp")
public class VerifyOtpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int sessionOtp = (int) request.getSession().getAttribute("otp");

		int userOtp = Integer.parseInt(request.getParameter("userOtp"));

		if (sessionOtp == userOtp) {

			response.sendRedirect("success.jsp");

		} else {

			response.getWriter().println("Invalid OTP");

		}
	}
}
