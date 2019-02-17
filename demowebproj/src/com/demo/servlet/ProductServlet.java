package com.demo.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.pojo.ProductPojo;
import com.demo.service.ProductService;

public class ProductServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String producttype = req.getParameter("ptype");
		String productname = req.getParameter("pname");
		int productprice =  Integer.parseInt(req.getParameter("pprice"));
		String productwarranty = req.getParameter("pwarranty");		
		
		System.out.println("product type :" +producttype	);
	
		ProductPojo productload = new ProductPojo();
		
		productload.setProductitemno(3);
		productload.setProducttype(producttype);
		productload.setProductname(productname);
		productload.setProductprice(productprice);
		productload.setProductwarrantydetails(productwarranty);
		String result = null;
		ProductService productservice = new ProductService();
		try {
			result = productservice.insertproduct(productload);
			 
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
