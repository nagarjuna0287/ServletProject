package com.mycompany.in;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{
		
	private static final long serialVersionUID = 1L;

		public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter p = response.getWriter();
		//String name=request.getParameter("search");
		p.println("welcome to ");
		p.println("servlets");
		//response.sendRedirect("https://www.google.co.in/#q="+name); 
			}
		

/*ServletConfig config;
public void init(ServletConfig config){
//this.config = config;
System.out.println("we are in FirstServlet init() method");
}
public void service(ServletRequest request, ServletResponse response){
System.out.println("we are in FirstServlet service() method");
}
public void destroy(){
System.out.println("we are in destroy() method");
}
//public ServletConfig getServletConfig(){
//return config;
//}
public String getServletInfo(){
return "this is my First servlet";   // return �fs�;
         }*/
}