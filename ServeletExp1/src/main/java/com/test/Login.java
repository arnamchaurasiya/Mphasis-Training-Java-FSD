package com.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
       response.setContentType("text/html");
       
       PrintWriter out = response.getWriter();
       String user = request.getParameter("user");
       String pas = request.getParameter("pwd");
       if(user.equals("admin") && pas.equals("java")) {
//    	   out.println("login success.");
//    	   RequestDispatcher rd  = request.getRequestDispatcher("home.html");
//    	   rd.forward(request, response);
    	   response.sendRedirect("home.html");
//    	   response.sendRedirect("https://spring.io/tools#eclipse");
	
    }
       else {
    	   out.println("<font color = 'red'> invalid credentials</fonts>");
    	   RequestDispatcher rd = request.getRequestDispatcher("login.html");
    	   rd.include(request, response);
       }
       }
}