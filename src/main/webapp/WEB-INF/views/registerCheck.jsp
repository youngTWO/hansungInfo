<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<title>수강신청 조회</title>
</head>
<body>
	<h3>2017-1 수강신청 조회</h3>
	<hr>

	<table class="formtable">
		<tr class="label">
			<th>수강년도</th>
			<th>학기</th>
			<th>교과코드</th>
			<th>교과목명</th>
			<th>학점</th>
		</tr>

		<c:forEach var="detail" items="${detail}">
			<tr>
				<td class="contents"><c:out value="${detail.year}"></c:out></td>
				<td class="contents"><c:out value="${detail.semester}"></c:out></td>
				<td class="contents"><c:out value="${detail.code}"></c:out></td>
				<td class="alignleft"><c:out value="${detail.name}"></c:out></td>
				<td class="contents"><c:out value="${detail.point}"></c:out></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>