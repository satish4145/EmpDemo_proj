package com.demo.servlet;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.PropertyConfigurator;

public class ContextListener implements ServletContextListener{

	 
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("inside detroy method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		

		// initialize log4j here
	    ServletContext context = event.getServletContext();
	    String log4jConfigFile = context.getInitParameter("log4j-config-location");
	    //"WEB-INF/log4j.properties"
	    String fullPath = context.getRealPath("") + File.separator + log4jConfigFile;
	     
	    PropertyConfigurator.configure(fullPath);

		System.out.println("inside initailize method");
		// TODO Auto-generated method stub
		
	}
	
	
}
