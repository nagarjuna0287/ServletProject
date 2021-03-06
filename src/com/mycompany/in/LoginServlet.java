package com.mycompany.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		if(pwd.equals("mylife007")){
			RequestDispatcher rd=request.getRequestDispatcher("Link.html");
			rd.include(request,response);
			 out.print("<br>You are successfully logged in!");  
	          out.print("<br>Welcome, "+user);  
	          Cookie ck=new Cookie("uname",user);
	          response.addCookie(ck);
	          
		}
		else{
			out.print("Incorrect password");
			request.getRequestDispatcher("Login.html").include(request,response);
		}
	}

}
