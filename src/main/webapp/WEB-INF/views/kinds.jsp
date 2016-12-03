<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>이수 구분별 학점</title>
</head>
<body>
	<h3>이수 구분별 학점</h3>
	<hr>

	<table class="formtable">
		<tr class="label">
			<c:forEach var="kindsList" items="${kindsList}">
				<th><c:out value="${kindsList.kind}"></c:out></th>
			</c:forEach>
			<th>총 학점</th>
		</tr>


		<tr class="contents">
			<c:forEach var="kindsList" items="${kindsList}">
				<td><c:out value="${kindsList.point}"></c:out></td>
			</c:forEach>
			<td>${total}</td>
		</tr>

	</table>
</body>
</html>