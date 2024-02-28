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
	<h3>oneInclude_07.jsp를 include하기</h3>
	<%
		request.setCharacterEncoding("utf-8");
	%>

	<jsp:include page="oneInclude_07.jsp">
		<jsp:param value="HappyDay!!" name="msg" />
		<jsp:param value="../image/food/1.jpg" name="imgname" />
	</jsp:include>
</body>
</html>