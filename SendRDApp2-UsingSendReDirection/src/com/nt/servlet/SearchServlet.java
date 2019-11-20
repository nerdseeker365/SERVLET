package com.nt.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/searchurl")
public class SearchServlet extends HttpServlet {
	
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		String ss=null;
		
		String engine=null;
		
		String url=null;
		
		RequestDispatcher rd=null;
		
		ss=req.getParameter("ss");
		
		engine=req.getParameter("engine");
		
		//Encode URL
		
		ss=URLEncoder.encode(ss);
		
		//Prepare URL with query String for Send Redirection
		
		if(engine.equalsIgnoreCase("google")) {
			
			url="https://www.google.co.in/search?q="+ss;
			
		}
		
		else if(engine.equalsIgnoreCase("bing")) {
			
			url="https://www.bing.com/search?q="+ss;
		
		}
		
		else {
			
			url="https://in.search.yahoo.com/search?p="+ss;
		}
		
		System.out.println("Before Search Servlet::SendReDirect(-)");
		
		res.sendRedirect(url);
		
		rd=req.getRequestDispatcher("input.html");//create input.html also ...
		
		System.out.println("After Search Servlet::SendReDirect(-)"); 
		
		rd.include(req, res);
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
