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
	<form action="quizWrite.jsp" method="post">
		<table class="table table-bordered" style="width: 600px">
			<tr>
				<th width="120" class="table-success" style="text-align: center; font-family:Gowun Dodum; ">이름</th>
				<td><input type="text" name="name" placeholder="이름"
					required="required" class="form-control" style="width: 120px"></td>
			</tr>
			<tr>
				<th width="120" class="table-success" style="text-align: center; font-family:Gowun Dodum; ">입사일</th>
				<td><input type="date" name="date"
					required="required" class="form-control" style="width: 120px"></td>
			</tr>
			<tr>
				<th width="120" class="table-success" style="text-align: center; font-family:Gowun Dodum; ">오늘 점심메뉴</th>
				<td>
				<input type="radio" name="chk" value="../image/food/1.jpg">&nbsp;
				<img src="../image/food/1.jpg" style="width: 100px">
				<input type="radio" name="chk" value="../image/food/2.jpg">&nbsp;
				<img src="../image/food/2.jpg" style="width: 100px">
				<input type="radio" name="chk" value="../image/food/3.jpg">&nbsp;
				<img src="../image/food/3.jpg" style="width: 100px">
				</td>
			</tr>
			<tr>
				<th width="120" class="table-success" style="text-align: center; font-family:Gowun Dodum; ">건의하는 메뉴</th>
				<td>
				<select name="menu" class="form-control" style="width: 300px" multiple="multiple">
						<option value="쌀국수">쌀국수</option>
						<option value="마라탕">마라탕</option>
						<option value="소고기 전골">소고기 전골</option>
						<option value="엽기떡볶이">엽기떡볶이</option>
				</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					class="btn btn-success" value="전송" style="width: 100px">
					<input type="reset" class="btn btn-danger" value="초기화" style="width: 100px"> </td>
			</tr>

		</table>
	</form>
</body>
</html>