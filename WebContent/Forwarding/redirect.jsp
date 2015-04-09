<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("id", "ppusari");
	request.setAttribute("pw", "1234");
		
	// 요청 받은 요청객체를 위임 받은 컴포넌트에 전달 하는 것이 아닌 새로운 요청객체를 생성하기 때문에 null 값이 출력됨
	response.sendRedirect("/ServletStudy/RequestObj2"); 
	
	// 아래와 같이 RequestDispatcher를 사용하면 직접 호출되기 때문에 null 이 아닌 값이 출력된다.
	//RequestDispatcher dispatcher  = request.getRequestDispatcher("/RequestObj2");
	//dispatcher.forward(request, response);
%>
</body>
</html>