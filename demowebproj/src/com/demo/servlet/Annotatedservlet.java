package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.cal.SatishCalculator;
@WebServlet(value = "/annotatedtest",loadOnStartup = 0)
public class Annotatedservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
     SatishCalculator s = new SatishCalculator();
    int sum =  s.sum(1, 9);
	System.out.println("Inside Do Get Method of AnnotatedTest");
	}

}
