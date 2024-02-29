<%@page import="info.model.infoDao"%>
<%@page import="info.model.infoDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	
	//입력 데이터를 dto 로 묶어서 
	infoDto dto = new infoDto();
	
	dto.setName(name);
	dto.setAddr(addr);
	
	//insert메서드로 전달
	infoDao dao = new infoDao();
	dao.infoInsert(dto);
	
	//출력 jsp로 이동 - url주소 바뀐
	response.sendRedirect("list.jsp");
	%>
</body>
</html>