<%@page import="com.daodto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.daodto.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	MemberDao memberDao = new MemberDao();
	ArrayList<MemberDto> dtos = memberDao.memberSelect();
	
 	for (int i=0; i<dtos.size(); i++){
		MemberDto dto = dtos.get(i);
		String name = dto.getName();
		String id = dto.getId();
		String pw = dto.getPw();
		String phone = dto.getPhone();
		
		out.println("이름: " + name + ", 아이디: " + id + ", 비밀번호: " + pw + ", 연락처: " + phone + "<br>");
	} 
	
%>
</body>
</html>