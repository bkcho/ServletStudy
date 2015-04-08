package com.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.controler.Service;
import com.login.MemberDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("*.do2") /*@WebServlet("/command")*/
public class command extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    public command() {
        super(); 
        System.out.println("command *.do2");
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String command = uri.substring(conPath.length());
		
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		
		if (command.equals("/Controller/membersAll.do2")){
			Service service = new MembersAllService();
			ArrayList<MemberDto> dtos = service.execute(request, response);
			
			for (int i=0; i<dtos.size(); i++) {
				MemberDto dto = dtos.get(i);
				
				String id = dto.getId();
				String pw = dto.getPw();
				String name = dto.getName();
				String phone = dto.getPhone();
				
				writer.println(id + "," + pw + "," + name + "," + phone  + "<br><hr>");
			} 
			
			writer.println("</body></html>");
		}		
/*		else if (command.equals("Controller/another.do2")){
			Service service = new AnotherService();
			...이런식으로 여러개 만들어 사용함.
		}
*/	}
}
