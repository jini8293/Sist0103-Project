<%@page import="test.Student"%>
<%@page import="java.util.Vector"%>
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
<h3 class="alert alert-danger">여기는 리다이렉트(stuRedirect_10.jsp) 파일입니다</h3>

<%
  Vector<Student> list=(Vector<Student>)request.getAttribute("list");

    //redirect로 이동시 request는 새로생성이 되므로 list는 없음
   if(list==null)
	   out.print("list가 없어요");
   else
	   out.print("list가 있어요");
%>
</body>
</html>