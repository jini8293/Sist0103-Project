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
	
	String grade = request.getParameter("grade");
	String[] lang = request.getParameterValues("lang");
	String like = request.getParameter("like");
	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	String ipsaday = request.getParameter("ipsaday");
	%>
	
	<h4 class="alert alert-success" style="width: 700px; font-family: Gowun Dodum;" >
	최종학력 | 
	<%=grade%><br>
	가능한 컴퓨터언어 |
	<%
	if (lang == null) {
	%>
	<font color="red">가능 언어 없음</font><br>
	<%
	} else {
		for (int i = 0; i < lang.length; i++) {
	%>
	<%=lang[i]%>&nbsp;
	<%
		}
	}
	%><br> 
	같은조 하고 싶은 사람 |
	<%=like%><br> 
	당신의 키 |
	<%=height%><br> 
	당신의 몸무게 |
	<%=weight%><br> 
	날짜 |
	<%=ipsaday%><br> 

</body>
</html>