package com.uniquedeveloper.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.uniquedeveloper.modal.Users1;


public class UserDao1 {
	public static int saveuser(Users1 us) throws SQLException,ClassNotFoundException{
		int a=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/employee","root","Bhushan@123");
		PreparedStatement pst = con.prepareStatement("insert into users(uname,upwd,uemail,umobile) values(?,?,?,?)");
		pst.setString(1, us.getUname());
		pst.setString(2, us.getUpwd());
		pst.setString(3, us.getUemail());
		pst.setString(4, us.getUmobile());
		
		a=pst.executeUpdate();
		con.close();
		return a;
		
	}
	
}
