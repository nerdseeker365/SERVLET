package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/s3url")
public class Servlet3 extends HttpServlet {
	
    @Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	
    	
    	//http://http://localhost:3030/Attributes-Scopes-SessionAttributes1/s3url
    	
		PrintWriter pw=null;
    
    	HttpSession ses=null;
    	
    	ServletContext sc=null;
		
    	//General Settings
    	
    	pw=res.getWriter();
    	
    	//setContentType
    	
    	res.setContentType("text/html");
    	
    	//Read and Display request attribute value
    	
    	pw.println("<br>Servlet3::attr1 attribute value:: "+req.getAttribute("attr1"));
    	
        //Read and Display Session attribute value
    	
    	ses=req.getSession();
    	
    	pw.println("<br>Servlet3::attr2 attribute value:: "+ses.getAttribute("attr2"));
    	
      //Read and Display ServletContext attribute value
    	
    	sc=req.getServletContext();
    	
    	pw.println("<br>Servlet3::attr3 attribute value:: "+sc.getAttribute("attr3"));
    	
    	
     //Close Stream
    	
    	pw.close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		doGet(req, res);
	}

}
