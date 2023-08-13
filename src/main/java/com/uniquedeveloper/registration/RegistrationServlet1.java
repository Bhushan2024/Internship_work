package com.uniquedeveloper.registration;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uniquedeveloper.dao.UserDao1;
import com.uniquedeveloper.modal.Users1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class RegistraionServlet
 */
@WebServlet("/register1")
public class RegistrationServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("pass");
		String umobile = request.getParameter("contact");
		
		Users1 us=new Users1();
		us.setUname(uname);
		us.setUpwd(upwd);
		us.setUemail(uemail);
		us.setUmobile(umobile);
		
		try {
			if (UserDao1.saveuser(us)>0) {
				request.getRequestDispatcher("login1.jsp").forward(request, response);
			}
			else {
				out.print("Registration Failed..");
				request.getRequestDispatcher("registration1.jsp").include(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
		
		

}
