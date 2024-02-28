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
	<h3>멤버 변수 출력</h3>
	<b>이름: <%=name%></b>
	<br>
	<b>연락처: <%=hp%></b>
	<br>
	<%!String name = "홍길동";
	String hp = "010-1111-5555";
	int age = 22;

	//메서드
	public String getCheck() {

		if (age >= 20) {
			return "성인입니다<br>";
		} else {
			return "미성년입니다<br>";
		}
	}%>

	<%=name%>님의 나이는
	<%=age%>세 입니다.
	<br>
	<%=getCheck()%>

	<%
	String addr = "강원도 속초시";
	String major = "경영학과";

	out.print(name + "님의 전공은 " + major + "입니다<br>");
	%>

	<h5>
		주소:
		<%=addr%></h5>
	<h5>
		전공:
		<%=major%></h5>
</body>
</html>