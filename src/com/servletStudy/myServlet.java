package com.servletStudy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mySvr") // http://localhost:8080/ServletStudy/mySvr
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public myServlet() {
    	 System.out.println("myServlet");     
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		response.setContentType("text/html; charset=UTF-8");
		 		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("Hello World~~~ 안녕하세요~~");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("myServlet");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1> POST 방식으로 호출되었습니다.");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();		
	}
}
