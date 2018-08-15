//DateServlet.java

package com.nt.servlet;

import javax.servlet.*;//Servlet API

import java.io.*;//IO Stream for PrintWriter

import java.util.*;//for Date class

public class DateServlet extends GenericServlet{
	
	/*public DateServlet(){
		
		System.out.println("consructor::0-parameter");
		
	}*/

	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{

		//System.out.println("service(--)");
	
		PrintWriter pw=null;

		

		//Get PrintWriter Object

		pw=res.getWriter();

		//Set Response Context type

		res.setContentType("text/html");

		//Write request Processing Logic

		Date d=new Date();

		//pw.println("<h1> Date and Time is:: "+d+"</h1>");
		
		pw.println("<h1 style='color:red;text-align:center'> Date and Time is:: "+d+"</h1>");
		
		/*try{
			
			Thread.sleep(40000);
		}
		
		catch(Exception e){
			
		e.printStackTrace();
			
		}

		pw.println("<br>our servlet class(DateServlet) object hashcode:: "+this.hashCode());
		
		pw.println("<br>request object hashcode:: "+req.hashCode());
		
		pw.println("<br>response object hashcode:: "+res.hashCode());
		
		pw.println("<br> current thread hashcode:: "+Thread.currentThread().hashCode());*/
		//pw.println("<br>request object class:: "+req.getClass());
		//pw.println("<br>response object class:: "+res.getClass());
		
		//Close Stream

		pw.close();

	}//service()


}//class