package controller;

/*
 * Que-023: Integrate Email Functionality in the Project: 
 * o Step1: Create a registration form. 
 * o Step2: After successful registration, send a confirmation email to the user using the JavaMail API.
 */

import java.io.IOException;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/registerEmail")
public class EmailRegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");

		final String senderEmail = "hemalparmar0001@gmail.com";
		final String password = "socqkfkixeonblni";

		Properties props = new Properties();

		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");

		Session session = Session.getInstance(props, new Authenticator() {

			protected PasswordAuthentication getPasswordAuthentication() {

				return new PasswordAuthentication(senderEmail, password);

			}

		});

		try {

			Message message = new MimeMessage(session);

			message.setFrom(new InternetAddress(senderEmail));

			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));

			message.setSubject("Registration Successful");

			message.setText("Hello " + name + ",\n\nYour registration was successful.\nWelcome to our website.");

			Transport.send(message);

			response.sendRedirect("success.jsp");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
