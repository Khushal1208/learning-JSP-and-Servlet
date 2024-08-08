package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(("/third"))
public class ThirdServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// doGet is the default req from browser
		System.out.println("Processing do get request by third servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String message = req.getParameter("message");

		System.out.println("Form submitted using post");
		System.out.println("message: " + message);

		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>Form Submitted</h1>");
		Date date = new Date();
		pw.print("""

				<h2> Message : %s</h2>
				<h2> Current Data is : %s</h2>

				""".formatted(message, date));

	}
}