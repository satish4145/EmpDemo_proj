package com.demo.service;
import java.sql.SQLException;
import java.util.ArrayList;
import com.demo.dao.ProductDao;
import com.demo.pojo.ProductPojo;

public class ProductService {

	ProductDao pd = new ProductDao();
	
	
	public String insertproduct(ProductPojo pp) throws SQLException, Exception {
		
		 return pd.insertproduct(pp);
		}
	
	public ArrayList<ProductPojo> getallproducts(String ptype) throws ClassNotFoundException, SQLException    {
		return pd.getallproducts(ptype);
	}
		
	public ProductPojo getproductdetails(int pitem) throws ClassNotFoundException, SQLException {
		return pd.getproductdetails(pitem );
		
	}
		 
	
	public String updateproduct(ProductPojo updateprod) throws SQLException {
		return pd.updateproduct(updateprod);
	 
	}

	public String deleteproducts(ProductPojo deleteprod) throws SQLException {
		return pd.deleteproducts(deleteprod);
	}

}

