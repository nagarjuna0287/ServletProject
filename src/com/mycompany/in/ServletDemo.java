package com.mycompany.in;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletDemo() {
        super();
    }

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String name=request.getParameter("uname");
			out.print("Hello"+name);
	}

	@Override
protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
	response.setContentType("text/html");
	PrintWriter p=response.getWriter();
	String s=request.getParameter("pwd");
	p.println("password"+s);
}
}