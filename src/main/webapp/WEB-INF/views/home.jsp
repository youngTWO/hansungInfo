<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Info Home</title>
</head>
<body>

	<p><a href="${pageContext.request.contextPath}/semester">1. 학기별 이수 학점 조회</a>
	<p><a href="${pageContext.request.contextPath}/kinds">2. 이수 구분별 학점 조회</a>
	<p><a href="${pageContext.request.contextPath}/register">3. 수강 신청하기</a>
	<p><a href="${pageContext.request.contextPath}/confirm">4. 수강 신청 조회 메뉴</a>

</body>
</html>
