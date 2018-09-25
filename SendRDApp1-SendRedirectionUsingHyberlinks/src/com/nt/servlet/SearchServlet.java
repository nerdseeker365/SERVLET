package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/searchurl")
public class SearchServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=null;
		
		String ss=null;
		
		
		//General Settings
		
		pw=res.getWriter();
		
		res.setContentType("text/html");
		
		//Read form Data
		
		ss=req.getParameter("ss");
		
		//Add Hyberlink having Google Search component URL
		
		
		pw.println(" <a href ='https://www.google.com/search?q= " +ss+  " ' >" + " <h1 style ='color:green;text-align:center'>  Click Here Go to Google </h> </a>");
		
		
	}

	
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
