<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 
Tomcat web.xml에 설정되어있는 세션 만료시간이 지나면 자동으로 세션이 삭제됨<p>

<%
	Enumeration enumeration = session.getAttributeNames();

	while (enumeration.hasMoreElements()){
		String sName = enumeration.nextElement().toString();
		String sValue = (String)session.getAttribute(sName);
		
		if (sValue.equals("test"))
			out.println(sValue + "님 안녕하세요~~" + "<p>");
	}	
%>

<a href="logout.jsp"> 로그아웃하기</a>
 

</body>
</html>