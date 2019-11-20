//wishMessaGeneratorServlet

package com.nt.servlet;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.util.Date;

import java.util.Calendar;

import java.io.PrintWriter;

import java.io.IOException;


public class WishMessageGeneratorServlet extends HttpServlet

{

	//2nd Srvice Method(--)

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

		PrintWriter pw=null;

		Calendar calendar=null;

		int hour=0;

		//Generate Settings,Get PrintWriter

		pw=res.getWriter();

		//Set Content Type

		res.setContentType("text/html");

		//Get System Date

		calendar=Calendar.getInstance();

		//Set Current Hour of the Day

		hour=calendar.get(Calendar.HOUR_OF_DAY);

		//Generate the WishMessage

		if(hour<12)

			pw.println("<h1 style ='color:orange'> Good Morning</h1>");

		else if(hour<16)

			pw.println("<h1 style='color:red'>Good AfterNoon</h1>");

		else if(hour<20)

			pw.println("<h1 style='color:yellow'>Good Evening </h1>");

		else

			pw.println("<h1 style='color:grey'>Good Night<h1>");

		//Generate the Hyberlink

		pw.println("<br> <a href='http://localhost:3030/WishApp/page.html'>Home</a>");

		//Close the Stream

		pw.close();

	}//service(-,-)

};//class
//javac -d . WishMessageGeneratorServlet.java