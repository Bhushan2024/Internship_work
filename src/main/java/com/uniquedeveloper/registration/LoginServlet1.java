package com.uniquedeveloper.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.http.HttpSession;

import com.uniquedeveloper.dao.*;
import com.uniquedeveloper.modal.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uniquedeveloper.dao.LoginDao1;
import com.uniquedeveloper.modal.LoginBean1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login1")
	public class LoginServlet1 extends HttpServlet {
	    private static final long serialVersionUID = 1 ;
	    private LoginDao1 loginDao1;

	    public void init() {
	        loginDao1 = new LoginDao1();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	        String username = request.getParameter("email");
	        String password = request.getParameter("pass");
	        LoginBean1 loginBean = new LoginBean1();
	        loginBean.setUsername(username);
	        loginBean.setPassword(password);

	        try {
	            if (loginDao1.validate(loginBean)) {
	                //HttpSession session = request.getSession();
	                // session.setAttribute("username",username);
	                response.sendRedirect("Co.jsp");
	            } else {
	                response.sendRedirect("login1.jsp");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}


