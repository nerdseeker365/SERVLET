package com.nt.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

public class ProcessServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	    PrintWriter pw=null;
	    String pValue=null;
	    int val1=0;
	    int val2=0;
	    
		//general settings,get PrintWriter Object
	    pw=res.getWriter();
	    
	    //set Response Content Type
	    res.setContentType("text/html");
	    
	    // read form data,Read "s1" Request parameter value to know the PValue that 
	    //is used to Send the Request
	    pValue=req.getParameter("s1");
	    
	    //read form data only when submit buttons are used to Submit the Request
	    if(!pValue.equals("link1") && !pValue.equals("link2")){
	    	val1=Integer.parseInt(req.getParameter("t1"));
	    	val2=Integer.parseInt(req.getParameter("t2"));
	    }
	    
	    
	    
	    //differentiate the logics for submit buttons and hyperlinks
	    if(pValue.equalsIgnoreCase("add(+)")){
	    	pw.println("<h1 style='color:green'> Sum is:: "+(val1+val2)+"</h1>");
	    }
	    
	    
	    else if(pValue.equalsIgnoreCase("sub(-)")){
	    	pw.println("<h1 style='color:green'> Sub is:: "+(val1-val2)+"</h1>");
	    }
	    
	    
	    else if(pValue.equalsIgnoreCase("mul(*)")){
	    	pw.println("<h1 style='color:green'>Mul is:: "+(val1*val2)+"</h1>");
	    }
	    
	    
	    else if(pValue.equalsIgnoreCase("link1")){
	    	pw.println("<h1 style='color:orange'> System Properties::"+System.getProperties()+"</h1>");
	    }
	    
	    
	    else{
	    	pw.println("<h1 style='color:orange'> System Date::"+new java.util.Date()+"</h1>");
	    }
	    
	    //add hyperlink
	    pw.println("<br><b><a href='form.html'>Home</b></a>");
	    
	    //close stream
	    pw.close();
	    
	}//doGet(-,-)
	
	@Override
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req,res);
		
	}//doPost(-,-)

}//class
