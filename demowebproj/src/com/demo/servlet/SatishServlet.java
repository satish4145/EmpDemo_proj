package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SatishServlet implements Servlet{

	@Override
	public void destroy() {//destroy method
		// TODO Auto-generated method stub
		System.out.println("Inside Destroy Method");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {//initialize
		// TODO Auto-generated method stub
		System.out.println("Inside Init Method");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Service Method");
	
	/*	// build HTML code
		PrintWriter writer = response.getWriter();
		String htmlRespone = "<html>";
        htmlRespone += "<h2>Your username is: " +    "<br/>";      
        htmlRespone += "Your password is: " +    "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);*/
	
	
	}
	
	

}
