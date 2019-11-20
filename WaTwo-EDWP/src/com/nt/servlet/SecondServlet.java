package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
      PrintWriter pw=null;
		
		int val=0;
		
		int cube=0;
		
		
		
		
		//General Settings
		
		pw=res.getWriter();
		
		res.setContentType("text/html");
		
		//Read form Data 
		
		val=Integer.parseInt(req.getParameter("no"));
		
		//Calculate Cube value
		
		cube=val*val*val;
		
		pw.println("<h1 style='color:red;text-align:center'> SecondServlet Value::Cube::\t\t"+"<h1 style='color:blue;text-align:center'>"+cube+"</h1>"+"</h1>");
		
		//do not close Streams
		
	}//doGet(--)

	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
