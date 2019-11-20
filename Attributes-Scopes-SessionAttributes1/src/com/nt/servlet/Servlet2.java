package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/s2url")
public class Servlet2 extends HttpServlet {
	
    @Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	
    	
    	//http://localhost:3030/Attributes-Scopes-SessionAttributes1/s2url
    	
		PrintWriter pw=null;
    
    	RequestDispatcher rd=null; 
    	
    	HttpSession ses=null;
    	
    	//General Settings
    	
    	pw=res.getWriter();
    	
    	//setContentType
    	
    	res.setContentType("text/html");
    	
    	//Read and Display request attribute value
    	
    	pw.println("<br>Servlet2::attr1 attribute value:: "+req.getAttribute("attr1"));
    	
       //Read and Display Session attribute value
    	
    	ses=req.getSession();
    	
    	pw.println("<br>Servlet2::attr2 attribute value:: "+ses.getAttribute("attr2"));
    	
      //Forward the request to servlet3 component 
    	
    	rd=req.getRequestDispatcher("/s3url");
    	
    	rd.forward(req, res);
    	
        //Close Stream
    	
    	pw.close();
		
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
	}

}
