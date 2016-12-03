<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Info Home</title>
</head>
<body>
	<h3>성적 조회 및 수강신청</h3>
	<hr>
	
	<p><a href="${pageContext.request.contextPath}/semester">1. 학기별 이수 학점 조회</a>
	<p><a href="${pageContext.request.contextPath}/kinds">2. 이수 구분별 학점 조회</a>
	<p><a href="${pageContext.request.contextPath}/register">3. 수강 신청</a>
	<p><a href="${pageContext.request.contextPath}/registerCheck">4. 수강 신청 조회</a>

</body>
</html>
