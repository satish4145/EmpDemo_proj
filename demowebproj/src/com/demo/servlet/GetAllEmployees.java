package com.demo.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.demo.pojo.EmpDetails;
import com.demo.service.EmpService;

public class GetAllEmployees extends HttpServlet {
	
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

	 EmpService empservice = new EmpService();
	 
	 try {
	 	ArrayList<EmpDetails> result = empservice.getemployees();
	 	req.setAttribute("employee", result);
		
		req.getRequestDispatcher("getallemployeedetails.jsp").forward(req, resp);
	 	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	 
	 }

}
