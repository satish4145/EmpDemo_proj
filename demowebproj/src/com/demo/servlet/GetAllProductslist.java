package com.demo.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.pojo.ProductPojo;
import com.demo.service.ProductService;

public class GetAllProductslist extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String producttype = req.getParameter("ptype");
      ProductService ps = new ProductService();
     try {
		ArrayList<ProductPojo> result = ps.getallproducts(producttype);
		req.setAttribute("product", result);
		req.getRequestDispatcher("getallproductslist.jsp").forward(req, resp);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
	
	}
}
