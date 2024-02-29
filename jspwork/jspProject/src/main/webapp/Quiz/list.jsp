<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Vector"%>
<%@page import="quiz.model.quizDao"%>
<%@page import="quiz.model.quizDto"%>
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
<%
request.setCharacterEncoding("utf-8");

quizDao dao = new quizDao();
Vector<quizDto> quiz = dao.listQuiz();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
%>
<body>

   <div style="margin: 50px 50px">
      <table class="table table-bordered">
         <caption align="top">
            <b>[ QUIZ 리스트 ●'◡'● ]</b>
         </caption>
         <tr>

            <th style="font-family: IBM Plex Sans KR" class="table-dark">No.</th>
            <th style="font-family: IBM Plex Sans KR" class="table-dark">NAME</th>
            <th style="font-family: IBM Plex Sans KR" class="table-dark">AGE</th>
            <th style="font-family: IBM Plex Sans KR" class="table-dark">H.P</th>
            <th style="font-family: IBM Plex Sans KR" class="table-dark">DRIVER</th>
            <th style="font-family: IBM Plex Sans KR" class="table-dark">JOIN DAY</th>

         </tr>
         <%
		for (int i = 0; i < quiz.size(); i++) {
			quizDto dto = quiz.get(i);
		%>

         <tr>
         <td align="center"><%=i+1 %></td>
            <td align="center"><%=dto.getName()%></td>
            <td><%=dto.getAge()%></td>
            <td><%=dto.getHp()%></td>
            <td><%=dto.getDriver()%></td>
            <td><%=sdf.format(dto.getWriteday())%></td>
         </tr>
         <% }%>
         
      </table>
      <button type="button" class="btn btn-dark"
         onclick="location.href='insertform.jsp'">추가</button>
   </div>
</body>
</html>