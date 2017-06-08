package com.mycompany.in;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
@WebServlet("/HiddenServlet2")
public class HiddenServlet2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

     //Getting the value from the hidden field
        String n=request.getParameter("uname");
        
        /*presentation logic*/
        
        out.print("<html>");
        out.print("<body>");
        
        out.print("Hello "+n);
       
        out.print("</body>");
        out.print("</html>");
      	}
}
