package com.nt.servlet;
/*
 * you copy and paste 
 * change name
 * properties-->right click on project
 * web project Settings change name
 */

import java.io.IOException;

import java.io.PrintWriter;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



public class CheckMarriageEligibilityServlet extends HttpServlet {

	
	     @Override
		public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
			
			PrintWriter pw=null;
			
			String name=null,gender=null;
			
			String tage=null;
			
			int age=0;
			
			//General settings,Get PrintWriter
			
			pw=res.getWriter();
			
			//set ResponseContentType
			
			res.setContentType("text/html");
			
			//Get request parameter query String values(form data),read form data 
			
			name=req.getParameter("pname");
			
			gender=req.getParameter("gen");
			
			
			
			
			//age=Integer.parseInt(req.getParameter("page"));
			
			tage=req.getParameter("page");
			
			
			//Server Side form Validation Logic
			
			System.out.println("Server Side form validations....");
			
			if(name==null || name.length()==0 || name.equalsIgnoreCase("") ) {
				
				pw.println("<h4 style=color:green>Person Name Is Required</h4>");
				
				return;
			}
			
			
			if(tage==null || tage.length()==0 || tage.equalsIgnoreCase("")) {
				
				pw.println("<h4 style=color:blue>Person Age Is Required</h4>");
				
				return;
			}
			
			else {
				
				try {
					
					age=Integer.parseInt(tage);
					
				if(age<1 || age >125) {
					
						pw.println("<h4 style=color:pink>Person Age must be 1 to 125</h4>");
						
						return;
					}
				}
					catch(NumberFormatException nfe) {
						
						pw.println("<h4 style=color:red>Person Age must be Numeric value</h4>");
						
						return;
					}
				}
			
			
			//Write Request processing logic
			
			if(gender.equalsIgnoreCase("M"))
				if(age>=21)	{
				
	
				pw.println("<h1 style='color:cyan;text-align:center'>Mr."+name+"  you are Boy/Man  Eligible for Marriage, But still Think once.</h1>");

		}
		
		else {
			
		
			pw.println("<h1 style='color:maroon;text-align:center'>Mr."+name+"  you are Boy/Man  not Eligible for Marriage, Feel happy</h1>");

		}
			if(gender.equalsIgnoreCase("F"))
				if(age>=18) {
					pw.println("<h1 style='color:cyan;text-align:center'>Miss."+name+"  you are Girl/Woman  Eligible for Marriage, But Keep your Terms and Conditions.</h1>");
				}
				else {
					pw.println("<h1 style='color:maroon;text-align:center'>Miss."+name+"  you are GIRL/Woman not Eligible for Marriage, Feel Double Happy and make Others Happy</h1>");

				}
			
		
		//add Hyberlink
		
		
		
		//pw.println("<br><a href='http://localhost:3030/MarriageApp/input.html'>Home</a>");
		//pw.println("<br><a href='input.html'>Home</a>");
		
		//close Stream
		
		pw.close();
	}
		@Override
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
			doGet(req,res);
		}

}
