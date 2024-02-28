<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
<style type="text/css">
.mainimg {
	width: 120px;
	height: 160px;
	border: 1px solid gray;
}

.mainimg:hover {
	cursor: pointer;
	width: 200px;
	height: 260px;
	border: 5px inset gray;
}
</style>
</head>
<body>

	<%
	List<String> list = new ArrayList();
	list.add("yellowgreen");
	list.add("orange");
	list.add("plum");
	list.add("red");
	list.add("pink");

	for (String a : list) {
	%>
	<div style="background-color: <%=a%>; width:100px; height:50px;"
		align="center"><%=a%></div>
	<%
	}
	%>

	<h3>이미지 배열로 출력</h3>

	<%
	String[] imgArr = { "1.jpg", "10.jpg", "11.jpg", "12.jpg", "5.jpg", "6.jpg", "8.jpg", "9.jpg", "2.jpg" };

	int n = 0;
	%>

	<table>
		<%
		for (int i = 0; i < 3; i++) { //행
		%>

		<tr height="100">
			<%
			for (int j = 0; j < 3; j++) { //열
			%>
			<td><img src="../image/food/<%=imgArr[n]%>" width="100"
				height="80"></td>
			<%
			n++;
			}
			%>
		</tr>
		<%
		}
		%>
	</table>

	<h2>문제: 연예인 사진 20개가 있다 4행 5열로 출력해주세요</h2>
	<%
	int a = 1;
	%>

	<table>
		<%
		for (int i = 0; i < 4; i++) {
		%>
		<tr height=100>
			<%
			for (int j = 0; j < 5; j++) {
				a++;
			%>
			<td><img src="../image/연예인이미지/<%=a%>.jpg" width="100"
				height="100" class="mainimg"></td>
			<%
			}
			%>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>