package com.nt.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import java.util.Arrays;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet  {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  {
		
		String name=null,gender=null,ms=null,paddress=null,qlfy=null,courses[]=null,hobies[]=null;
		
		int age=0;
		
		PrintWriter pw=null;
		
		//get PrintWriter object
		
		pw=res.getWriter();
		
		//set Response Content Type
		
		res.setContentType("text/html");
		
		name=req.getParameter("pname");
		
				
		age=Integer.parseInt(req.getParameter("page"));
		
		gender=req.getParameter("gen");
		
		ms=req.getParameter("ms");
		
			    if(ms==null)
				ms="single";
			    
		paddress=req.getParameter("paddress");
		
		qlfy=req.getParameter("qlfy");
		
		courses=req.getParameterValues("courses");
		
				if(courses==null) {
					courses=new String[1];
					courses[0]="No Course is Selected ";
				}
				
		hobies=req.getParameterValues("hb");
		
			if(hobies==null) {
				hobies=new String[1];
				hobies[0]="No Hobies are Selected ";
			}
		
		//Write Request Processing logic
			
		if(gender.equalsIgnoreCase("M")) {
			if(age<=5)	
			

			pw.println("<h1 style='color:cyan;text-align:center'>Master."+name+"  you are Baby Boy.</h1>");
			
			else if(age<=12)
				
				pw.println("<h1 style='color:cyan;text-align:center'>Master."+name+"  you are Small Boy.</h1>");
			
			else if(age<=19)
				
				pw.println("<h1 style='color:cyan;text-align:center'>Master/Mr."+name+"  you are Teenage Boy.</h1>");
			
			else if(age<=35)
				
				pw.println("<h1 style='color:cyan;text-align:center'>Mr."+name+"  you are Young Man.</h1>");
			
			else if(age<=50)
			
				pw.println("<h1 style='color:cyan;text-align:center'>Mr."+name+"  you are Middle Aged Man.</h1>");
			
			else
				
				pw.println("<h1 style='color:cyan;text-align:center'>Mr."+name+"  you are Budda.</h1>");
				

	}//if 
		else if(gender.equalsIgnoreCase("F")) {
			
			if(age<=5)	
				

				pw.println("<h1 style='color:cyan;text-align:center'>Master."+name+"  you are Baby Girl.</h1>");
				
				else if(age<=12)
					
					pw.println("<h1 style='color:cyan;text-align:center'>Master."+name+"  you are Small Girl.</h1>");
			
				else if(age<=19) 
					if(ms.equalsIgnoreCase("Married"))
					
					pw.println("<h1 style='color:cyan;text-align:center'>M."+name+"  you are Married Girl.</h1>");
				
				else 
					pw.println("<h1 style='color:cyan;text-align:center'>M."+name+"  you are Young Girl.</h1>");
				
				else if(age<=35)
					if(ms.equalsIgnoreCase("Married"))
					
					pw.println("<h1 style='color:cyan;text-align:center'>M."+name+"  you are  Married Young .</h1>");
			
				else 
					pw.println("<h1 style='color:cyan;text-align:center'>M."+name+"  you are Married-Middle Age.</h1>");
				
				else if(age<=50)
				
					pw.println("<h1 style='color:cyan;text-align:center'>M."+name+"  you are Married-Buddi.</h1>");
			
				else 
					pw.println("<h1 style='color:cyan;text-align:center'>M."+name+"  you are Single Buddi.</h1>");
		}
			//display form data
		
			pw.println("<br>Name::"+name);
		
			
			pw.println("<br>Age::"+age);
		
				
			pw.println("<br>Gender::"+gender);
			
						
			pw.println("<br>Marital Status::"+ms);
			
					
			pw.println("<br>Address::"+paddress);
			
				
			pw.println("<br>Qualification::"+qlfy);
			
					
			pw.println("<br>Courses::"+Arrays.toString(courses));
			
					
			pw.println("<br>Hobies::"+Arrays.toString(hobies));
			
					
			pw.println("<br> <a href='form.html'>Home</a>");
			
				
			//close Stream
			
			pw.close();
			
		}//	doGet(--)
	
		//Add HyberLink
	
		@Override
		public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  {
			
			doGet(req,res);
		
		}
		

}//class
