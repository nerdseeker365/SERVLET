package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LcTestServlet extends HttpServlet{
	
	static {
		
		System.out.println("LcTestServlet:static block");
	}//static block

	public LcTestServlet() {
		System.out.println("LcTestServlet:0-param constructor");
	}//constructor
	public void init(ServletConfig cg)
	{
		System.out.println("LcTestServlet:init(-)");
	}//init(-)
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("LcTestServlet:service(-,-)");
		//General Settings
		PrintWriter pw=null;
		pw=res.getWriter();res.setContentType("text/html");
		//Display System  Date And time
		
		pw.println("<h1 style='color:red'>System Date And Time::"+new java.util.Date()+"</h>");
		//close stream
		pw.close();
		
	}//service(--)
	public void destroy() {
		System.out.println("LcTestServlet:destroy(-)");
	}//destroy
	

}//class
