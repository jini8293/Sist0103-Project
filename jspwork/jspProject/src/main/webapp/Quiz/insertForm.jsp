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
	<div style="margin: 30px 50px">
		<form action="insertAction.jsp" method="post">
			<table class="table table-bordered" style="width: 350px">
				<caption align="top">
					<b>QUIZ 리스트에 추가하기</b>
				</caption>
				<tr>
					<th class="table-dark" width="100"
						style="font-family: IBM Plex Sans KR; font-size: 15pt;">&nbsp;이름</th>
					<td><input type="text" name="name" placeholder="이름"
						required="required" class="form-control"
						style="width: 150px; font-family: IBM Plex Sans KR;"></td>
				</tr>
				
				<tr>
					<th class="table-dark" width="100"
						style="font-family: IBM Plex Sans KR; font-size: 15pt;">&nbsp;나이</th>
					<td><input type="text" name="age" placeholder="나이"
						required="required" class="form-control"
						style="width: 100px; font-family: IBM Plex Sans KR;"></td>
				</tr>
				<tr>
					<th class="table-dark" width="100"
						style="font-family: IBM Plex Sans KR; font-size: 15pt;">&nbsp;전화번호</th>
					<td><input type="text" name="hp" placeholder="전화번호"
						required="required" class="form-control"
						style="width: 200px; font-family: IBM Plex Sans KR;"></td>
				</tr>
				<tr>
					<th class="table-dark" width="100"
						style="font-family: IBM Plex Sans KR; font-size: 15pt;">&nbsp;운전면허</th>
					<td><input type="checkbox" value="있음" name="driver"
						style="font-family: IBM Plex Sans KR; width: 50px">있음 <input
						type="checkbox" value="없음" name="driver"
						style="font-family: IBM Plex Sans KR; width: 50px">없음</td>
				</tr>
			</table>

			<input type="submit" value="추가" class="btn btn-dark"
				style="font-family: IBM Plex Sans KR; margin-left: 295px">
		</form>
	</div>
	<br>
	<hr>


</body>
</html>