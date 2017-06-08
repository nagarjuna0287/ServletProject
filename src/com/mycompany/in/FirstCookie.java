package com.mycompany.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstCookie")
public class FirstCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		Cookie ck=new Cookie("password",password);
			response.addCookie(ck);
			ck=new Cookie("username",uname);
			response.addCookie(ck);
		//out.print("Hello"+uname);
		out.print("<form action='SecondCookie' method='post'>");
	    out.print("<input type='submit' value='go'>");
	    out.print("</form>");
				}

}
