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
	String date = request.getParameter("date");
	String lunch = request.getParameter("chk");
	String[] menu = request.getParameterValues("menu");
	%>

	<h4 class="alert alert-success" style="width: 700px; font-family: Gowun Dodum;" >
	이름&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| 
	<%=name%><br>
	입사일자     | 
	<%=date%><br> 
	
	오늘 점심메뉴 |
	<img src="<%=lunch%>" style="width: 100px"><br>
	
	건의하는 메뉴 |
		<%
	if (menu == null) {
	%>
	<font color="red">건의 메뉴 없음</font><br>
	<%
	} else {
		for (int i = 0; i < menu.length; i++) {
	%>
	[<%=menu[i]%>]&nbsp;
	<%
		}%>
		
		<%
	}
	%>
	</h4>
</body>
</html>