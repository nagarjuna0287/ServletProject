package com.mycompany.in;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RetriveData")
public class RetriveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	//Statement stmt;
	
	@Override
	public void init() throws ServletException {
	try {
		Class.forName("oracle.jdbc.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
			
			Statement stmt;
			try {
				stmt = con.createStatement();
			
				response.setContentType("text/html");	
				String name=request.getParameter("sname");		
				ResultSet rs= stmt.executeQuery("select * from student where name='"+name+"'");
					while(rs.next()){
						out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3));
						out.println("   ");
				} 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}

