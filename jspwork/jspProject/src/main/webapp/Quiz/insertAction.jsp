<%@page import="quiz.model.quizDao"%>
<%@page import="quiz.model.quizDto"%>
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
	String hp = request.getParameter("hp");
	String age = request.getParameter("age");
	String driver = request.getParameter("driver");
	
	quizDto dto = new quizDto();
	
	dto.setName(name);
	dto.setHp(hp);
	dto.setAge(age);
	dto.setDriver(driver);
	
	quizDao dao = new quizDao();
	dao.insertQuiz(dto);
	
	response.sendRedirect("list.jsp");
	%>

</body>
</html>