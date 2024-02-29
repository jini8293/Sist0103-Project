<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Vector"%>
<%@page import="info.model.infoDao"%>
<%@page import="info.model.infoDto"%>
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

infoDao dao = new infoDao();
Vector<infoDto> list = dao.getAllDatas();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
%>
<body>
<div style="margin: 50px 100px">
	<table class="table table-bordered" style="width: 800px">
		<caption align="top">
			<<b>info 전체목록</b>>
		</caption>
		<tr class="table-success">
			<th width="50">번호</th>
			<th width="120">이름</th>
			<th width="150">주소</th>
			<th width="180">날짜</th>
			<th width="120">수정 / 삭제</th>
		</tr>
		<%
		for (int i = 0; i < list.size(); i++) {
			infoDto dto = list.get(i);
		%>
		<tr>
			<td align="center"><%=i + 1%></td>
			<td align="center"><%=dto.getName()%></td>
			<td align="center"><%=dto.getAddr()%></td>
			<td align="center"><%=sdf.format(dto.getSdate())%></td>
			<td align="center">
				<button type="button" class="btn btn-info btn-sm"
					 onclick="location.href='updateForm.jsp?num=<%=dto.getNum()%>'">수정</button>
				<button type="button" class="btn btn-danger btn-sm"
					onclick="location.href='infoDelete.jsp?num=<%=dto.getNum()%>'">삭제</button>
			</td>
		</tr>
	<%
		}
		%>
	</table>
</div>
<hr>
	<button onclick="location.href='addForm.jsp'" type="button"
		class="btn btn-success" style="margin-left: 95px">입력폼</button>
	<hr>	<br><br>
		
</body>
</html>