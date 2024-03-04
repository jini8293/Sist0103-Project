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
	<form action="infoWrite_01.jsp" method="post">
		<table class="table table-bordered" style="width: 50%">
			<caption align="top">Radio & CheckBox</caption>
			<tr height="30">
				<td><b>최종학력선택</b> <input type="radio" name="grade" value="고등학교">고등학교&nbsp;
					<input type="radio" name="grade" value="전문대학">전문대학&nbsp; <input
					type="radio" name="grade" value="대학">대학&nbsp; <input
					type="radio" name="grade" value="대학원">대학원&nbsp;</td>
			</tr>
			<tr height="30">
				<td><b>가능한 컴퓨터언어</b> <input type="checkbox" name="lang"
					value="C++">C++&nbsp; <input type="checkbox" name="lang"
					value="JAVA">JAVA&nbsp; <input type="checkbox" name="lang"
					value="Pyton">Pyton&nbsp; <input type="checkbox"
					name="lang" value="Android">Android&nbsp;</td>
			</tr>

			<tr>
				<td><b>같은조 하고 싶은 사람?</b> <select name="like">
						<option value="민규">민규</option>
						<option value="유리" selected="selected">유리</option>
						<option value="효영">효영</option>
						<option value="인규">인규</option>
						<option value="석훈">석훈</option>
				</select></td>
			</tr>

			<tr>
				<td><b>당신의 키?</b> <input type="number" name="height" max="230"
					min="150" step="2" value="150">cm</td>
			</tr>
			<tr>
				<td><b>당신의 몸무게?</b> <input type="number" name="weight"
					max="120" min="50" step="1" value="50">kg</td>
			</tr>
			<tr>
				<td><b>날짜선택</b> <input type="date" name="ipsaday"></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value="전송"> <input
					type="reset" value="초기화">
				</td>
			</tr>
		</table>


	</form>
</body>
</html>