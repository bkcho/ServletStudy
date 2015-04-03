package com.servletStudy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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
		pw.println("Hello World~~~ �ȳ��ϼ���~~");
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
		pw.println("<h1> POST ������� ȣ��Ǿ����ϴ�.");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();		
	}
	
	@Override
	public void init() throws ServletException {		
		System.out.println("init");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	
	@PostConstruct    // <-- @PostConstruct �������̼��� �߰��ϸ�  init() �Լ����� ���� ����ȴ�. initPostConstruc �Լ����� ����ڰ� �����Ѵ�.
	private void initPostConstruc() {
		System.out.println("initPostConstruc");
	}
	
	@PreDestroy
	private void destoryPreDestory() {
		System.out.println("destoryPreDestory");
	}
}
