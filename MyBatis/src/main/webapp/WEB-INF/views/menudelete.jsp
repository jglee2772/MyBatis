<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 지우기</title>
</head>
<style>
table { margin:auto; border-collapse:collapsed;}
td { border:1px solid black;}
</style>
<body>
<form method='post' action='/delete'>
<table>
<tr><td>삭제할 아이디 :</td><td><input type=text name=id></td></tr>
<tr><td colspan=2><input type=submit value="삭제"></td></tr>
</table>
</form>
<br>
<table>
<c:forEach items="${arMenu}" var="menu">
	<tr>
		<td>${menu.id}</td><td>${menu.name}</td><td>${menu.price}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>