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

	String city1 = request.getParameter("city");
	String[] city2 = request.getParameterValues("city2");
	%>

	<h4 class="alert alert-info" style="width: 700px">
	1순위 지역:
	<%=city1%><br> 
	2순위 지역:
	<%
	if (city2 == null) {
	%>
	<font color="red">선택 안함</font><br>
	<%
	} else {
		for (int i = 0; i < city2.length; i++) {
	%>
	[<%=city2[i]%>]&nbsp;
	<%
		}%>
		<br><b>총 <%=city2.length %>개 지역을 선택함</b>
		<%
	}
	%>
</h4>
</body>
</html>