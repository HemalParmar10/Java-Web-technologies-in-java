package controller;

/*
 * Que-022: Image Upload/Download Functionality: 
 * o Step1: Create a JSP form to upload an image file. 
 * o Step2: Write a servlet to handle the file upload and store the image in a designated folder on theserver. 
 * o Step3: Implement a servlet to list and download stored images by retrieving the files from the server. 
 */

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/listImages")
public class ImageListServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = getServletContext().getRealPath("") + File.separator + "images";

		File folder = new File(path);

		File files[] = folder.listFiles();

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<h2>Uploaded Images</h2>");

		if (files != null) {

			for (File file : files) {

				String fileName = file.getName();

				out.println("<a href='downloadImage?name=" + fileName + "'>" + fileName + "</a><br>");
			}

		}
	}
}
