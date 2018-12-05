package whatsapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgotServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("entered into forgot password servlet");

		String MailID = req.getParameter("email");
		String Question1 = req.getParameter("question1");
		String Question2 = req.getParameter("question2");
		String Answer1 = req.getParameter("answer1");
		String Answer2 = req.getParameter("answer2");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Loaded the driver class...");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Sree.6168");
			System.out.println("connection was opened");
			PreparedStatement ps = con.prepareStatement("select * from avco where MailID  = ?");
			ps.setString(1, MailID);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				PreparedStatement ps1 = con.prepareStatement("select * from security where MailID = ? and Question1 = ? and Answer1 = ? and Question2 = ? and Answer2 = ? ");
				ps1.setString(1, MailID);
				ps1.setString(2, Question1);
				ps1.setString(3, Answer1);
				ps1.setString(4, Question2);
				ps1.setString(5, Answer2);
				ResultSet rs1 = ps1.executeQuery();

				if (rs1.next()) {
					req.getRequestDispatcher("profile.jsp").forward(req, resp);
				} else {
					System.out.println("plese enter with valid details");
					req.setAttribute("message", "please enter with valid credentials");
					req.getRequestDispatcher("ForgotPassword.jsp").forward(req, resp);
				}
			} else {
				req.setAttribute("message", "please enter with valid credentials");
				req.getRequestDispatcher("ForgotPassword.jsp").forward(req, resp);
			}
			
			con.close();
		} catch (Exception e) {
			System.out.println("not stored in database");

			e.printStackTrace();
		}
	}

}
