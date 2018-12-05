package whatsapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.Normalizer.Form;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.validation.ValidateText;

public class WhatsappServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
				
				ValidateText vali = new ValidateText();
				vali.testCheck();
				
				
				
		System.out.println("Login Sucessfully");

		String MailID = req.getParameter("email");
		String Password = req.getParameter("pwd");
		String Name = req.getParameter("name");
		String Mobile = req.getParameter("mbl");
		String Salary = req.getParameter("sal");
		String Company = req.getParameter("comp");
		String Question1 = req.getParameter("question1");
		String Question2 = req.getParameter("question2");
		String Answer1 = req.getParameter("answer1");
		String Answer2 = req.getParameter("answer2");

		/*
		 * req.setAttribute("mail",MailID); req.setAttribute("pwd", Password);
		 * req.getAttribute("mail"); req.getAttribute("pwd");
		 */

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Loaded the driver class...");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Sree.6168");
			System.out.println("connection was opened");
			PreparedStatement ps = con.prepareStatement("insert into avco values(?,?,?,?,?,?)");
			
			ps.setString(1, MailID);
			ps.setString(2, Password);
			ps.setString(3, Name);
			ps.setString(4, Mobile);
			ps.setString(5, Salary);
			ps.setString(6, Company);

			int recordcount = ps.executeUpdate();

			System.out.println("Number of records count :" + recordcount);
			System.out.println("query executed successfully");

			PreparedStatement ps1 = con.prepareStatement("insert into security values(?,?,?,?,?)");
			
			ps1.setString(1, MailID);
			ps1.setString(2, Question1);
			ps1.setString(3, Answer1);
			ps1.setString(4, Question2);
			ps1.setString(5, Answer2);

			int recordcount1 = ps1.executeUpdate();

			System.out.println("Number of records count :" + recordcount1);
			System.out.println("query executed successfully");

		} catch (Exception e) {
			System.out.println("solution not found here");
			e.printStackTrace();

		}

		req.getRequestDispatcher("WhatsappLogin.jsp").forward(req, resp);

	}
}
