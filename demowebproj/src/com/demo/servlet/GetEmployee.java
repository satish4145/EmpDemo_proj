package com.demo.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.pojo.EmpDetails;
import com.demo.service.EmpService;

public class GetEmployee extends HttpServlet{

	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int employeeid = Integer.parseInt(req.getParameter("eid"));
		 EmpService empService = new EmpService();
		 try {
		 EmpDetails empd =	empService.getemployeedetails(employeeid);
			req.setAttribute("employee", empd);
	     	req.getRequestDispatcher("employeedetails.jsp").forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
}
