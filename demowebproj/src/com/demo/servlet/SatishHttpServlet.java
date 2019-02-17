package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SatishHttpServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	

		System.out.println("Inside doget method");
		String employeename = req.getParameter("ename");
		System.out.println("Print employeename "+ employeename);
		String employeesal =  req.getParameter("esal");
		System.out.println("Print esalary "+employeesal);
}
 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);

		System.out.println("Inside dopost method");
		String employeename = req.getParameter("ename");
		System.out.println("Print employeename "+ employeename);
		String employeesal =  req.getParameter("esal");
		System.out.println("Print esalary "+employeesal);
 
 
 }
 
 

}
