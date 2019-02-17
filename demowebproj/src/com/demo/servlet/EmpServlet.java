package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.pojo.EmpDetails;
import com.demo.service.EmpService;

public class EmpServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String employeename = req.getParameter("ename");
		int employeesal = Integer.parseInt(req.getParameter("esal"));
		int employeessn = Integer.parseInt(req.getParameter("essn"));
		String empaddress = req.getParameter("eadd");

		System.out.println("employeename "+employeename);
		System.out.println("employeesal "+employeesal);
		System.out.println("employeessn "+employeessn);
		System.out.println("employee address "+empaddress);

		EmpDetails empDetails = new EmpDetails();
		empDetails.setEmpname(employeename);
		empDetails.setEmpsalary(employeesal);
		empDetails.setEmpssn(employeessn);
		empDetails.setEmpaddress(empaddress);
		empDetails.setEmpid(1111);
        String result =null;
		EmpService empService = new EmpService();
		try {
			result = empService.insertemployee(empDetails);
			if (result!=null){
				req.getRequestDispatcher("success.jsp").forward(req,resp);
			}else {
				req.getRequestDispatcher("failure.jsp").forward(req,resp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}
