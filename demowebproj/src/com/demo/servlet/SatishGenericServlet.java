package com.demo.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SatishGenericServlet extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		System.out.println("Inside Service method");
		String employeename = request.getParameter("ename");
		System.out.println("Print employeename "+ employeename);
		String employeesal =  request.getParameter("esal");
		System.out.println("Print esalary "+employeesal);
	}

	
}
