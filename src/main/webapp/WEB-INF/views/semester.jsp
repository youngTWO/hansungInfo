<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>학기별 이수 과목</title>
</head>
<body>
	<h3>학기별 이수 과목</h3>
	<hr>
	<table class="formtable">
		<tr>
			<th>년도</th>
			<th>학기</th>
			<th>이수 학점</th>
			<th>상세보기</th>
		</tr>

		<c:forEach var="semesterList" items="${semesterList}">
			<tr>
				<td><c:out value="${semesterList.year}"></c:out></td>
				<td><c:out value="${semesterList.semester}"></c:out></td>
				<td><c:out value="${semesterList.point}"></c:out></td>
				<td>
					<a href="${pageContext.request.contextPath}/semesterDetail?year=${semesterList.year}&semester=${semesterList.semester}">
						링크
					</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>