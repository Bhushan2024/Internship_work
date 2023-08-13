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

import com.uniquedeveloper.dao.LoginDao;
import com.uniquedeveloper.modal.LoginBean;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
	public class LoginServlet extends HttpServlet {
	    private static final long serialVersionUID = 1 ;
	    private LoginDao loginDao;

	    public void init() {
	        loginDao = new LoginDao();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	        String username = request.getParameter("email");
	        String password = request.getParameter("pass");
	        LoginBean loginBean = new LoginBean();
	        loginBean.setUsername(username);
	        loginBean.setPassword(password);

	        try {
	            if (loginDao.validate(loginBean)) {
	                //HttpSession session = request.getSession();
	                // session.setAttribute("username",username);
	                response.sendRedirect("index.jsp");
	            } else {
	                response.sendRedirect("login.jsp");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}


