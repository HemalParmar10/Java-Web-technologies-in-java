package controller;

/*
 * Que-022: Image Upload/Download Functionality: 
 * o Step1: Create a JSP form to upload an image file. 
 * o Step2: Write a servlet to handle the file upload and store the image in a designated folder on theserver. 
 * o Step3: Implement a servlet to list and download stored images by retrieving the files from the server. 
 */

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/uploadImage")
@MultipartConfig
public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Part filePart = request.getPart("image");

		String fileName = filePart.getSubmittedFileName();

		String uploadPath = getServletContext().getRealPath("") + File.separator + "images";

		File uploadDir = new File(uploadPath);

		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}

		filePart.write(uploadPath + File.separator + fileName);

		response.getWriter().println("Image Uploaded Successfully");

	}
}
