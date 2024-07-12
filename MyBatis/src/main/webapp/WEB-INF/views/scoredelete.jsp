<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수 지우기</title>
</head>
<style>
table { margin:auto; border-collapse:collapsed;}
td { border:1px solid black;}
</style>
<body>
<form method='post' action='/scoredelete'>
<table>
<tr><td>삭제할 아이디 :</td><td><input type=text name=sid></td></tr>
<tr><td colspan=2><input type=submit value="삭제"></td></tr>
</table>
</form>
<br>
<table>
	<tr><td>아이디</td><td>이름</td><td>국어점수</td><td>영어점수</td><td>수학점수</td></tr>
<c:forEach items="${arScore}" var="score">
	<tr>
		<td>${score.id}</td><td>${score.name}</td><td>${score.korean}</td><td>${score.english}</td><td>${score.math}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>