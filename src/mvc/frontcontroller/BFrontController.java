package mvc.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.BCommand;
import mvc.command.BListCommand;
import mvc.command.BWriteComand;

@WebServlet("/*.do3")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public BFrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actioinDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actioinDo(request, response);
	}
	
	private void actioinDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actioinDo");
		
		request.setCharacterEncoding("UTF-8");
		
		String viewPage = null;
		BCommand command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if (com.equals("/write.do3")){
			viewPage = "write.jsp";
			command = new BWriteComand();
			command.execute(request, response);
		}else if ( com.equals("/list.do3")){
			viewPage = "list.jsp";
			command = new BListCommand();
			command.execute(request, response);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
