package com.nt.servlet;

import javax.servlet.*;

import javax.servlet.http.*;

import java.io.*;

public class CheckVotingEligibilityServlet extends HttpServlet 

{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		
		//public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
			
			PrintWriter pw=null;
			
			String name=null,tage=null;
			
			int age=0;
			
			//General setttings,Get PrintWriter
			
			pw=res.getWriter();
			
			//set ResponseContentType
			
			res.setContentType("text/html");
			
			//Get request parameter query String values(form data),read form data 
			
			name=req.getParameter("pname");
			
			tage=req.getParameter("age");
			
			
			
			age=Integer.parseInt(req.getParameter("page"));
			
			//Write Request processing logic
			
			if(age>=18)
				
		{
				pw.println("<h1 style='color:red;text-align:center'>mr/miss\t"+name+"  you are Eligible for Vote</h1>");

		}
		
		else
			
		{
			pw.println("<h1 style='color:green;text-align:center'>mr/miss/mrs\t"+name+"  you are not Eligible for Vote</h1>");

		}
		
		//add Hyberlink
		
		
		
		pw.println("<a href='http://localhost:3030/VoterApp/input.html'><img src='v.jpg'width='100' height='100'/></a>");
		
		//close Stream
		
		pw.close();

	}
	
};//class