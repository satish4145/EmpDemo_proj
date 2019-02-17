package com.demo.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.demo.pojo.EmpDetails;
import com.demo.utils.ConnectionUtils;

public class EmpDao {
	final static Logger logger = Logger.getLogger(EmpDao.class);// to log 02/11/19

	public String insertemployee(EmpDetails ed) throws Exception, SQLException {

		Connection conn = null;
		Statement stmt = null;
		String result = null;
		conn = ConnectionUtils.getconnection();
		if (conn != null) {
			System.out.println("connection established");

			stmt = conn.createStatement();
			String sql = "insert into employee values (" + ed.getEmpid() + ",'" + ed.getEmpname() + "',"
					+ ed.getEmpsalary() + "," + ed.getEmpssn() + ",'" + ed.getEmpaddress() + "')";

			System.out.println(sql);
			int res = stmt.executeUpdate(sql);

			if (res > 0) {
				result = "success";
				// System.out.println("insert successfull");
				logger.debug("Successfully Inserted");

			} else {

				// System.out.println("Insert Failed");
				logger.fatal("Insert Failed");
			}

		} else {
			System.out.println("Connection not Established");
		}
		return result;

	}

	public ArrayList<EmpDetails> getemployees() throws SQLException {

		ArrayList<EmpDetails> al = new ArrayList<EmpDetails>();
		Statement stmt = null;
		Connection conn = null;

		try {
			conn = ConnectionUtils.getconnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn != null) {
			System.out.println("!!connection established!!!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select emp_id,emp_name,emp_salary,emp_ssn,emp_address from employee");

			// System.out.println("@@@After sql statement@@@");

			while (rs.next()) {
				EmpDetails emp = new EmpDetails();
				emp.setEmpid(rs.getInt("emp_id"));
				emp.setEmpname(rs.getString("emp_name"));
				emp.setEmpsalary(rs.getInt("emp_salary"));
				emp.setEmpssn(rs.getLong("emp_ssn"));
				emp.setEmpaddress(rs.getString("emp_address"));
				al.add(emp);
			}

		}

		else {
			System.out.println("Connection not Established");
		}

		conn.close();
		return al;
	}

	public ArrayList<EmpDetails> getallemployees() throws SQLException, IOException {

		ArrayList<EmpDetails> al = new ArrayList<EmpDetails>();
		Statement stmt = null;
		Connection conn = null;

		try {
			conn = ConnectionUtils.getconnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn != null) {
			System.out.println("!!connection established!!!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select emp_id,emp_name,emp_salary,emp_ssn,emp_address from employee");

			// System.out.println("@@@After sql statement@@@");

			while (rs.next()) {
				EmpDetails emp = new EmpDetails();
				emp.setEmpid(rs.getInt("emp_id"));
				emp.setEmpname(rs.getString("emp_name"));
				emp.setEmpsalary(rs.getInt("emp_salary"));
				emp.setEmpssn(rs.getLong("emp_ssn"));
				emp.setEmpaddress(rs.getString("emp_address"));
				al.add(emp);
			}

		}

		else {
			System.out.println("Connection not Established");
		}

		conn.close();
		return al;
	}

	public String updateemployees(EmpDetails e2) throws SQLException {

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
			String sql = "update employee set  emp_salary = " + e2.getEmpsalary() + " where emp_id = " + e2.getEmpid()
					+ "";

			System.out.println(sql);

			int res = stmt.executeUpdate(sql);

			if (res > 0) {
				result = "success";
				System.out.println("Emp Salary Update successfull");

			} else {
				result = "failed";
				System.out.println("Employee Salary Update Failed");
			}

		} else {
			System.out.println("Connection not Established");
		}
		return result;
	}

	public EmpDetails getemployeedetails(int empid) throws SQLException {

		Statement stmt = null;
		Connection conn = null;
		EmpDetails emp = null;
		try {
			conn = ConnectionUtils.getconnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn != null) {
			System.out.println("!!connection established!!!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select emp_id,emp_name,emp_salary,emp_ssn,emp_address from employee where emp_id = " + empid);

			// System.out.println("@@@After sql statement@@@");

			while (rs.next()) {
				emp = new EmpDetails();
				emp.setEmpid(rs.getInt("emp_id"));
				emp.setEmpname(rs.getString("emp_name"));
				emp.setEmpsalary(rs.getInt("emp_salary"));
				emp.setEmpssn(rs.getLong("emp_ssn"));
				emp.setEmpaddress(rs.getString("emp_address"));

			}

		}

		else {
			System.out.println("Connection not Established");
		}

		conn.close();
		return emp;
	}

	public void deleteemployees(EmpDetails e3) throws SQLException {

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
			String sql = "delete from employee where emp_id = e3.getEmpid";

			System.out.println(sql);

			int res = stmt.executeUpdate(sql);

			if (res > 0) {
				System.out.println("Emp Deleted  successfull");

			} else {
				System.out.println("Employee Deleted  Failed");
			}

		}

		else {
			System.out.println("Connection not Established");
		}

	}
}

// scope: how data stored within the servlet.
/*
 * request- once sent from form - close session - bank site , within the session
 * application - till the server restart page : within page
 */
// what are jsp implicit objects
// difference bw servlet & jsp
// servlet lifecycle
// jsp lifecylce

// information, debug,error
// fatal error,

// listenor
// init
// filter

// git

// DataSource:
