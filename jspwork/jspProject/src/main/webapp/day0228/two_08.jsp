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
	<h3>twoInclude_08.jsp파일 include하기</h3>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:include page="twoInclude_08.jsp">
		<jsp:param value="신민아" name="  "/>
		<jsp:param value="서울 강남구" name="addr"/>
		<jsp:param value="../image/연예인이미지/17.jpg" name="celeb"/>
	</jsp:include>
</body>
</html>