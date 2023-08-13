package com.uniquedeveloper.registration;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uniquedeveloper.dao.UserDao;
import com.uniquedeveloper.modal.Users;

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
@WebServlet("/register")
public class RegistraionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("pass");
		String umobile = request.getParameter("contact");
		
		Users us=new Users();
		us.setUname(uname);
		us.setUpwd(upwd);
		us.setUemail(uemail);
		us.setUmobile(umobile);
		
		try {
			if (UserDao.saveuser(us)>0) {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else {
				out.print("Registration Failed..");
				request.getRequestDispatcher("registration.jsp").include(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
		
		

}
