package com.demo.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 
public class ConnectionUtils {
	
	//write a method "Get connection" - it should return a connection

	public static Connection getconnection () throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");// Step1: Register the Driver 
		//Step 3: Open a cONNECTION
		System.out.println("Connecting to Database...");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","demo_own");//step2 : Create the connection
		 
		
		/*Connection conn = null;
		 	FileReader reader = new FileReader("Full path");
			Properties prop = new Properties();
			prop.load(reader);
			 String drivers = prop.getProperty("oracle.jdbc.driver.OracleDriver");
			    String connectionURL = prop.getProperty("jdbc:oracle:thin:@localhost:1521:xe");
			    String username = prop.getProperty("system");
			    String password = prop.getProperty("demo_own");
			    Class.forName(drivers);
			    conn = DriverManager.getConnection(connectionURL,username,password);//step2 : Create the connection
*/		 
		 if (conn!=null)
		 {
			 System.out.println("connection established");
		 }
			 else
			 {
			System.out.println("Connection not Established");	 
			 }
		 
		
	return conn;
		
	}
}

