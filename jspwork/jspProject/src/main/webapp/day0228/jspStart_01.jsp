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
	<h4>Jsp는 HTML5구조에 자바코드를 사용할 수 있는 서버 언어이다.</h4>
	<h4>
		Servlet는 확장자가 java이며 자바 클래스 구조에 <br> html, css, javascript도 사용가능한
		서버 언어이다
	</h4>

	<hr>
	<h4>jsp주석은 2가지가 가능</h4>
	<!-- 주석_1: html기본 주석 : 페이시 소스보기에서 보인다 -->
	<%-- jsp주석 : 소스보기에서 안보인다, 안에 자바 코드가 있을 경우 이 주석은 비실행 --%>

	<%!//선언문 
	//이곳은 선언한 변수나 메서드는 클래스의 멤버변수나 메서드로 등록된다%>

	<h4>java코드 쓰려면 scriptlet영역을 표시후 코딩</h4>

	<%
	//scriptlet
	//여기서 선언하는 변수는 지역변수로 등록이됨
	//그래서 이곳의 변수를 html에서 사용하려면 선언한 곳보다 아래서 사용한다

	//주석도 자바주석 모든 자바코드 가능
	int age = 20;
	String name = "이효리";
	%>
	
	<h4>문자열이나 변수출력은 표현식을 이용해서 출력한다</h4>
	<b>이름: </b><%=name %>님<br>
	<b>나이: </b><%=age %>세<br>

</body>
</html>