package com.nt.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

public class ShowCitiesServlet extends HttpServlet {
	
	
	@Override
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		PrintWriter pw=null;
		
		int country=0;
		
		String capital[]=new String[] {"new Delhi","Islmabad","Bejing","CanBerra","WastingtonDC"};
		
		String countries[]=new String[] {"India","Pakistan","China","Australia","USA"};
		
		//Read Form data
		
		country=Integer.parseInt(req.getParameter("country"));
		
		//Generate Settings
		
		pw=res.getWriter();
		
		//Set Response Content Type
		
		res.setContentType("text/html");
		
		//Display Capital
		
		pw.println("<h1 style=color:pink>Countries Name::\t"+countries[country]+"</h1>");
		
		pw.println("<h1>Capital Name::\t"+capital[country]+"</h1>");
		
		
		//Add HiberLink
		
		pw.println("<br> <a href='input.html'>Home</a>");
		
		//close Stream
		
		pw.close();
		
		
		
	}//doGet(--)
	
	@Override
	
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		doGet(req,res);
		
	}//doPost(--)


}//class
