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

	<h3>request에 Vector 저장후 불러오는 연습</h3>
	
	<%
		Vector<Student> list = new Vector<>();
		list.add(new Student("이미영","강남구",88));
		list.add(new Student("이영자","서초구",87));
		list.add(new Student("김미영","영등포구",77));
		list.add(new Student("이소라","부산시",99));
		list.add(new Student("배윤영","제주 애월",66));
		
		//데이터 vector를 request에 저장
		request.setAttribute("list", list);
		
		//페이지 이동2: forwoard(url주소 안바뀜) redirect(url주소 바뀜)
		
	%>
	
	<jsp:forward page="stuForward_10.jsp"></jsp:forward>
	
</body>
</html>