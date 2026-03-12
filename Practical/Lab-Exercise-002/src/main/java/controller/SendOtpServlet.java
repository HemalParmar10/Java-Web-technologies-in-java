package controller;

/*
 * Que-024: OTP Verification: 
 * o Step1: Create a registration form with an email field. 
 * o Step2: Generate an OTP upon form submission and send it to the provided email address. 
 * o Step3: Create a form to enter the OTP and verify the user’s email before allowing account creation. 
 */

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/sendOtp")
public class SendOtpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");

		Random rand = new Random();
		int otp = 100000 + rand.nextInt(900000);

		HttpSession session = request.getSession();
		session.setAttribute("otp", otp);
		session.setAttribute("email", email);

		final String senderEmail = "hemalparmar0001@gmail.com";
		final String password = "socqkfkixeonblni";

		Properties props = new Properties();

		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");

		Session mailSession = Session.getInstance(props, new Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(senderEmail, password);

			}

		});

		try {

			Message message = new MimeMessage(mailSession);

			message.setFrom(new InternetAddress(senderEmail));

			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));

			message.setSubject("OTP Verification");

			message.setText("Your OTP is: " + otp);

			Transport.send(message);

		} catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect("verify_otp.jsp");
	}
}
