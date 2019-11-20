package com.nt.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import java.util.Date;

import java.util.Locale;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

public class LinksServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=null;
		String pvalue=null;
		Locale locales[]=null;
		
		//general settings,get PrintWriter
		pw=res.getWriter();
		
		//set response  Content type
		res.setContentType("text/html");
		
		//read "p1" request parameter value to known the hyberlink that is clicked 
		
		pvalue=req.getParameter("p1");
		
		
		//write req processing logic
		if(pvalue.equalsIgnoreCase("link1")){//all languages 
			
			pw.println("<br> <h2 style='color:red'> All Languages are </2>");
			
			//get All Available  Locales
			locales=Locale.getAvailableLocales();
			
			for(Locale l:locales){
				pw.println("<br><b>"+l.getDisplayLanguage()+"</b>");
			}//for
		}//if
		
		
		else if(pvalue.equalsIgnoreCase("link2")){
			
			pw.println("<br> <h2 style='color:oracle'> All Countries are </2>");
			
			//get All Available  Locales
			locales=Locale.getAvailableLocales();
			
			for(Locale l:locales){
				pw.println("<br><b>"+l.getDisplayCountry()+"</b>");
			}//for
		}//else
		
		
		else{
			pw.println("<br><h2 style='color:green'> System Date and time "+new Date()+"</h2>");
		}
		
		
		//add hyperlink
		pw.println("<br> <a href='links.html'>home</a>");
		
		
		//close stream 
		pw.close();
		
	}//doGet(-,-)
	
	
	
	@Override
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		 doGet(req,res);
		 
	}//doPost(-,-)
	
}//class
