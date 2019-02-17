package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.demo.pojo.ProductPojo;
import com.demo.utils.ConnectionUtils;

public class ProductDao{

	public String insertproduct(ProductPojo pp) throws SQLException, ClassNotFoundException {
		
		Connection conn = null;
		Statement stmt = null;
		String result = null;
		int itemno = 0;
		conn = ConnectionUtils.getconnection();
		if (conn != null) {
			System.out.println("connection established");
			stmt = conn.createStatement();
			
			PreparedStatement ps = conn.prepareStatement("select max(PRODUCT_ITEM_NO) from product");
			ResultSet rs  = ps.executeQuery();
			if (rs.next()) {
				itemno = rs.getInt(1);
				itemno++;
			}
			
			String sql = "insert into product values (" +itemno+ ",'" + pp.getProducttype() + "','"
					+ pp.getProductname() + "'," + pp.getProductprice() + ",'" + pp.getProductwarrantydetails()+ "')";

			System.out.println(sql);
			int res = stmt.executeUpdate(sql);

			if (res > 0) {
				result = "success";
				System.out.println("insert successfull");

			} else {

				System.out.println("Insert Failed");
			}

		} else {
			System.out.println("Connection not Established");
		}
		return result;

	}
	//get details based on product type
	
	public ProductPojo getproductdetails(int Pitem) throws SQLException, ClassNotFoundException {
		
		 Connection conn = null;
		 Statement stmt = null;
		 ProductPojo p1 = null;
		 conn = ConnectionUtils.getconnection();
			if (conn != null) {
				System.out.println("connection established");
				stmt = conn.createStatement();
			//	String sql = ("select product_item_no, product_type,product_name,product_price,prduct_warranty_details from product where product_item_no = "+Pitem+" and  product_type ='"+ptype+"'");
				String sql = ("select product_item_no, product_type,product_name,product_price,prduct_warranty_details from product where product_item_no = "+Pitem+"  ");
				System.out.println(sql);
				ResultSet rs = stmt.executeQuery(sql);  
				 while(rs.next())
				 {
				  p1 = new ProductPojo();
				  p1.setProductitemno(rs.getInt("product_item_no"));
				  p1.setProducttype(rs.getString("product_type"));
				  p1.setProductname( rs.getString("product_name"));
				  p1.setProductprice(rs.getInt("product_price"));
				  p1.setProductwarrantydetails(rs.getString("prduct_warranty_details"));
				   
				 } 
			}else {
				System.out.println("Connection failed");
			}
			
		return p1;	
	}	
		
	//get all products
	public ArrayList<ProductPojo> getallproducts(String ptype) throws ClassNotFoundException, SQLException{
		
		ArrayList<ProductPojo> productlist = new ArrayList<ProductPojo>();
		 Connection conn = null;
		 Statement stmt = null;
		 conn = ConnectionUtils.getconnection();
			if (conn != null) {
				System.out.println("connection established");
				stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select product_item_no, product_type,product_name,product_price,prduct_warranty_details from product where product_type = '"+ptype+"'"); 
				 while(rs.next())
				 {
				  ProductPojo pp = new ProductPojo();
				  pp.setProductitemno(rs.getInt("product_item_no"));
				  pp.setProducttype(rs.getString("product_type"));
				  pp.setProductname( rs.getString("product_name"));
				  pp.setProductprice(rs.getInt("product_price"));
				  pp.setProductwarrantydetails(rs.getString("prduct_warranty_details"));
				  productlist.add(pp);
				 } 
			}else {
				System.out.println("Connection failed");
			}
			
		return productlist;	
	}

	public String updateproduct(ProductPojo p3) throws SQLException {

		Statement stmt = null;
	    String result = null;
		Connection conn = null;
		try {
			conn = ConnectionUtils.getconnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn != null) {
			System.out.println("connection established");

			stmt = conn.createStatement();
			String sql = "update product set  product_item_price = "+p3.getProductprice()+" where product_item_no = " + p3.getProductitemno() + " AND "+p3.getProducttype()+"";

			System.out.println(sql);

			int res = stmt.executeUpdate(sql);

			if (res > 0) {
				result = "success";
				System.out.println("  Update successfull");

			} else {
				result ="failed";
				System.out.println("  Update Failed");
			}

		} else {
			System.out.println("Connection not Established");
		}
		return result;
	}

	public String deleteproducts(ProductPojo p4) throws SQLException {
		String result = null;
		Statement stmt = null;
		Connection conn = null;

		try {
			conn = ConnectionUtils.getconnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn != null) {
			System.out.println("connection established");
			stmt = conn.createStatement();
			String sql = "delete from employee where product_item_no = "+p4.getProductitemno()+"";

			System.out.println(sql);

			int res = stmt.executeUpdate(sql);

			if (res > 0) {
				result = "success";
				System.out.println(" Delete  successfull");

			} else {
				System.out.println("Delete  Failed");
			}

		}

		
		else {
			System.out.println("Connection not Established");
		}
		return result;

	}

	
	
	



}



