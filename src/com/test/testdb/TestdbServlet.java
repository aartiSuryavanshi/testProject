package com.test.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class TestdbServlet
 */
@WebServlet("/TestdbServlet")
public class TestdbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user="springstudent";
		String pass="springstudent";
		
		String jdbcUrl="jdbc:mysql://localhost:3636/aarti_suryavanshi?allowPublicKeyRetrieval=true&useSSL=false";
		String driver="com.mysql.jdbc.Driver";
		
		
		//get connection to database
		
		try {
			PrintWriter out=response.getWriter();
			System.out.println("Connecting to data base:"+ jdbcUrl);
			
			Class.forName(driver);
			
			Connection myCon=DriverManager.getConnection(jdbcUrl,user,pass);
			
			System.out.println("Success!!!");
			
			myCon.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new ServletException(e);
		}

		
		
		
	}

}
