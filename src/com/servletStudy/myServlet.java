package com.servletStudy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/mySvr","/mySvr3"}, initParams={@WebInitParam(name="sex", value="����"), @WebInitParam(name="name", value="������")}) // http://localhost:8080/ServletStudy/mySvr
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
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pw");
		
		String tel = getInitParameter("tel");
		String address = getInitParameter("address");
		String sex = getInitParameter("sex");
		String name = getInitParameter("name");		
		String school = getServletContext().getInitParameter("school");
		String animals = getServletContext().getInitParameter("animals");
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1> POST ������� ȣ��Ǿ����ϴ�.");
		pw.println("<p>���̵�: " + id + "<br/>");
		pw.println("��й�ȣ: " + pwd + "<br/>");
		pw.println("��ȭ��ȣ: " + tel + "<br/>");
		pw.println("�ּ�: " + address + "<br/>");
		pw.println("����: " + sex + "<br/>");
		pw.println("�̸�: " + name + "<br/>");	
		pw.println("�б�: " + school + "<br/>");
		pw.println("����: " + animals + "<br/>");		
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
