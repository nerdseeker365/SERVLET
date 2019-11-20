package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=null;
		
		int val=0;
		
		int square=0;
		
		ServletContext sc1=null;
		
		ServletContext sc2=null;
		
		RequestDispatcher rd=null;
		
		
		//General Settings
		
		pw=res.getWriter();
		
		res.setContentType("text/html");
		
		//Read form Data 
		
		val=Integer.parseInt(req.getParameter("no"));
		
		//Calculate SQUARE value
		
		square=val*val;
		
		//Display SQUARE value
		
		pw.println("<h1 style='color:red;text-align:center'> FirstServlet Value::Suqare::\t\t"+" <h1 style='color:green;text-align:center'>"+square+"</h1>"+"</h1>");
		
		//Include the response of SecondServlet Component 
		
		//Get ServletContext object of Current web application
		
		sc1=getServletContext();
		
		//Get ServletContext object of WATwo web application
		
		//ForiegnContext
		
		sc2=sc1.getContext("/WaTwo-EDWP");
		
		//Get RequestDispatcher object pointing to SecondServlet
		
		rd=sc2.getRequestDispatcher("/secondurl");
		
		rd.include(req, res);
		
		//Add Hyberlink
	
		pw.println("<center><br><br><br> <a href='form.html'>Home</a></center");
		
		//Close Stream 
		
		pw.close();
		
		
	}//doGet(-,-)

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
