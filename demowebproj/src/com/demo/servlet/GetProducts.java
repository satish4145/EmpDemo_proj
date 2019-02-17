package com.demo.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.pojo.ProductPojo;
import com.demo.service.ProductService;

public class GetProducts extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int productitem = Integer.parseInt(req.getParameter("pitem"));
	 	System.out.println("product item "+productitem);
	    ProductService ps = new ProductService();
	     
	     try {
		 	ProductPojo pj = ps.getproductdetails(productitem);
		 	System.out.println("prod price"+pj.getProductprice());	
		 	req.setAttribute("product",pj);
				req.getRequestDispatcher("getproductdetails.jsp").forward(req, resp);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		 }  
	}


