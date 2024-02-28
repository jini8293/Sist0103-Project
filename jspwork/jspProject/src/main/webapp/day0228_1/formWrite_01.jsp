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
	
	String name= request.getParameter("name");
	String pass=request.getParameter("pass");
	String li = request.getParameter("chk");
	%>
	
	
	<h3 class="alert alert-danger" style="width: 400px">결과값 출력</h3>
	이름: <%=name %><br>
	비밀번호: <%=pass %><br>
	운전면허: <%=li==null?"없음":"있음" %><br>
</body>
</html>