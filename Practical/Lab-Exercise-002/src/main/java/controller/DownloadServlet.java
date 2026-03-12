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

@WebServlet("/downloadImage")
public class DownloadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fileName = request.getParameter("name");

		if (fileName == null || fileName.equals("")) {
			response.getWriter().println("File name missing");
			return;
		}

		String path = getServletContext().getRealPath("") + File.separator + "images" + File.separator + fileName;

		File file = new File(path);

		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename=" + fileName);

		FileInputStream fis = new FileInputStream(file);

		OutputStream os = response.getOutputStream();

		byte[] buffer = new byte[4096];
		int bytesRead;

		while ((bytesRead = fis.read(buffer)) != -1) {
			os.write(buffer, 0, bytesRead);
		}

		fis.close();
		os.close();
	}
}
