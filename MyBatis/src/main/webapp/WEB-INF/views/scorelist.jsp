<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>score list</title>
</head>
<style>
table { margin:auto; border-collapse:collapsed;}
td { border:1px solid black;}
</style>
<body>
<table>
	<tr><td>이름</td><td>국어점수</td><td>영어점수</td><td>수학점수</td></tr>
<c:forEach items="${arScore}" var="score">
	<tr>
		<td>${score.name}</td><td>${score.korean}</td><td>${score.english}</td><td>${score.math}</td>
	</tr>
</c:forEach>
	<tr><td><a href="/score">Back</a></td></tr>
</table>
</body>
</html>