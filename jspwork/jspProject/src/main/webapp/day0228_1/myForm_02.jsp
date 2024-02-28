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
	<form action="formWrite_02.jsp" method="post">
		<table class="table table-bordered" style="width: 400px">

			<tr>
				<th width="130">1순위 지역선택</th>
				<td>
				<select name="city" class="form-control" style="width: 100px">
						<option value="서울">서울</option>
						<option value="경기">경기</option>
						<option value="인천">인천</option>
						<option value="대전">대전</option>
						<option value="대구">대구</option>
						<option value="부산">부산</option>
						<option value="제주">제주</option>
				</select>
				</td>
			</tr>

			<tr>
				<th width="130">2순위 지역선택</th>
				<td>
				<select name="city2" class="form-control" style="width: 100px" multiple="multiple">
						<option value="서울">서울</option>
						<option value="경기">경기</option>
						<option value="인천">인천</option>
						<option value="대전">대전</option>
						<option value="대구">대구</option>
						<option value="부산">부산</option>
						<option value="제주">제주</option>
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