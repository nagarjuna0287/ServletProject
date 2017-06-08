package com.mycompany.in;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/HiddenServlet1")
public class HiddenServlet1 extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
           response.setContentType("text/html");  
           PrintWriter out = response.getWriter();  
          
           String n=request.getParameter("userName");  
           //out.print("Welcome "+n);  
          
        //creating form that have invisible textfield  
        out.print("<form action='HiddenServlet2'>");  
        out.print("<input type='hidden' name='uname' value='"+n+"'>");  
        out.print("<input type='submit' value='go'>");  
        out.print("</form>");  
       
  
	}

}


