package whatsapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		System.out.println("entered into login Servlet");
		
		String MailID = req.getParameter("email");
		String Password = req.getParameter("pwd");
		System.out.println(MailID);
		System.out.println(Password);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Loaded the driver class...");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Sree.6168");
			System.out.println("connection was opened");
			PreparedStatement ps = con.prepareStatement("select * from avco where MailID= ? and Password = ?");
			ps.setString(1, MailID);
			ps.setString(2, Password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				req.getRequestDispatcher("profile.jsp").forward(req, resp);
			} else {
				req.setAttribute("message", "please enter with valid credentials");
				req.getRequestDispatcher("WhatsappLogin.jsp").forward(req, resp);
			}
			con.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
