package com.demo.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.demo.dao.EmpDao;
import com.demo.pojo.EmpDetails;

public class EmpService {
	
 EmpDao empDao = new EmpDao();
 
	
 public String insertemployee(EmpDetails ed) throws SQLException, Exception {
		
	 return empDao.insertemployee(ed);
	}
	
	public ArrayList<EmpDetails> getemployees() throws SQLException  {
		return empDao.getemployees();
	}
	
	public EmpDetails getemployeedetails(int eid) throws SQLException {
		 return empDao.getemployeedetails(eid);
		 
	}
	
	public String updateemployees(EmpDetails e2) throws SQLException {
		return empDao.updateemployees(e2);
		 
	}
	
	public void deleteemployees(EmpDetails e3) throws SQLException {
	
		empDao.deleteemployees(e3);
	}

}
