<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>2017-1 수강신청</title>
</head>
<body>
	<h3>2017-1 수강신청</h3>
	<hr>
	
	<form:form method="get"
		action="${pageContext.request.contextPath}/register"
		modelAttribute="subject">
		<form:input type="hidden" path="year" value="2017" />
		<form:input type="hidden" path="semester" value="1" />
		<table>
			<tr>
				<th class="label">교과코드</th>
				<th class="label">교과목명</th>
				<th class="label">구분</th>
				<th class="label">학점</th>
			</tr>
			<tr>
				<td><form:errors cssClass="error" path="code"></form:errors></td>
				<td><form:errors cssClass="error" path="name"></form:errors></td>
				<td></td>
				<td><form:errors cssClass="error" path="point"></form:errors></td>
			</tr>
			<tr>
				<td>
					<form:input type="text" path="code"/>
				</td>
				<td>
					<form:input type="text" path="name" />
				</td>
				<td>
					<form:select path="kind">
						<option value="교필">교필</option>
						<option value="핵심A">핵심A</option>
						<option value="핵심B">핵심B</option>
						<option value="일교">일교</option>
						<option value="전기">전기</option>
						<option value="전지">전지</option>
						<option value="전선">전선</option>
					</form:select>
				</td>
				<td><form:input type="text" path="point" /></td>
			</tr>
		</table>
		<br>
		<input type="submit" value="register" />
	</form:form>
</body>
</html>