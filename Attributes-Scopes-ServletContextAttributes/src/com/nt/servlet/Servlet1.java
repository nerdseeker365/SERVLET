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
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/s1url")
public class Servlet1 extends HttpServlet {
	
    @Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	
    	//http://localhost:3030/Attributes-Scopes-SessionAttributes1/s1url
    	
    	
    	
		PrintWriter pw=null;
    	
    	RequestDispatcher rd=null;
    	
    	HttpSession ses=null;
    	
    	ServletContext sc=null;
    	
    	//General Settings
    	
    	pw=res.getWriter();
    	
    	//setContentType
    	
    	res.setContentType("text/html");
    	
    	//Create request attribute
    	
    	req.setAttribute("attr1", "val1");
    	
    	//CreateSession Attribute
    	
    	ses=req.getSession();
    	
    	ses.setAttribute("attr2","val2");
    	
    	//Create ServletContext attribute
    	
    	sc=getServletContext();
    	
    	sc.setAttribute("attr3","val3");
    	
    	//Forward the request to servlet2 component 
    	
    	rd=req.getRequestDispatcher("/s2url");
    	
    	rd.forward(req, res);
    	
       //Close Stream
    	
    	pw.close();
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
	}

}
