package com.demo.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.pojo.EmpDetails;
import com.demo.service.EmpService;

public class UpdateEmployee extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String result = null;
		int employeeid = Integer.parseInt(req.getParameter("eid"));
		int employeesal = Integer.parseInt(req.getParameter("esal"));
		System.out.println("employee id "+employeeid);
		System.out.println("employee sal "+employeesal);
		EmpDetails empdetails = new EmpDetails();
		empdetails.setEmpid(employeeid);
		empdetails.setEmpsalary(employeesal);
		EmpService esalup = new EmpService();
		        try {
					result= esalup.updateemployees(empdetails);
					
					if (result!=null){
						req.getRequestDispatcher("updatesucess.jsp").forward(req,resp);
					}else {
						req.getRequestDispatcher("updatefailure.jsp").forward(req,resp);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
