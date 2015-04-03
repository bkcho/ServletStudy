package com.servletStudy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mySvr") // http://localhost:8080/MyServlet/mySvr
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public myServlet() {
    	 System.out.println("myServlet");     
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("myServlet");
	}

}
