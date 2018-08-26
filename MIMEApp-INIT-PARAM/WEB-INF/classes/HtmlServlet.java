//HtmlServlet.java

/*

<tr>-->table row
<th>-->table header
<td>-->table cell or standard cell
*/

package com.nt.servlet;


import javax.servlet.*;

import javax.servlet.http.*;

import java.io.*;

public class HtmlServlet extends HttpServlet 

{
	
		static {
		
		System.out.println("HtmlServlet:static block");
		
	}//static block

	public HtmlServlet() {
		
		System.out.println("HtmlServlet:0-param constructor");
		
	}//constructor
	
	public void init(ServletConfig cg)
	
	{
		
		System.out.println("HtmlServlet:init(-)");
		
	}//init(-)
	
	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
		System.out.println("HtmlServlet:servic(-,-)");
		
		//get PrintWriter object
		
		PrintWriter pw=null;
		
		pw=res.getWriter();
		
		//set response ContentType
		
		res.setContentType("text/html");
		
		//Write logic to generate output (webpages),Display Content
		
		 pw.println("<table border='1' bgcolor='cyan'>");
		
		pw.println("<tr>  <th>Show Name</th>  <th>Host</th>  </tr>");
		
		pw.println("<tr>  <td>Big Boss-Telugu</td>  <td>Natural Star-Nani</td>  </tr>");
		
		pw.println("<tr>  <td>Big Boss-Tamil</td>  <td>Movie Navel-Kamal Hasan</td>  </tr>");
		
		pw.println("<tr>  <td>Big Boss-Marathi</td>  <td>The Foriegn Villan-Mahesh</td>  </tr>");
		
		pw.println("<tr>  <td>Big Boss-Hindi</td>  <td>Chickora Star-Salman Khan</td>  </tr>");
		
		/*pw.println("<tr>  <th>Player</th>  <th>Role</th>  </tr>");
		
		pw.println("<tr>  <td>Dhoni</td>  <td>Captain</td>  </tr>");
		
		pw.println("<tr>  <td>Sachin</td>  <td>All Rounder</td>  </tr>");
		
		pw.println("<tr>  <th>Habits</th>  <th>Role</th></tr>");
		
		pw.println("<tr>  <td>Reading </td>  <td>books</td>  </tr>");
		
		pw.println("<tr>  <td>cricket</td>  <td>All Rounder</td>  </tr>");*/
		
		pw.println("</table>");
		
		//close Streams 
		
	}//service

};//class