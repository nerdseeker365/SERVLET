package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckMarriageEligibilityServlet extends HttpServlet {

	
		
		public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
			
			PrintWriter pw=null;
			
			String name=null,gender=null;
			
			int age=0;
			
			//General setttings,Get PrintWriter
			
			pw=res.getWriter();
			
			//set ResponseContentType
			
			res.setContentType("text/html");
			
			//Get request parameter query String values(form data),read form data 
			
			name=req.getParameter("pname");
			
			gender=req.getParameter("gen");
			
			
			
			age=Integer.parseInt(req.getParameter("page"));
			
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
		pw.println("<br><a href='input.html'>Home</a>");
		
		//close Stream
		
		pw.close();
	}

}
