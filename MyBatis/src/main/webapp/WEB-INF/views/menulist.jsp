<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu List</title>
</head>
<style>
td { border:1px solid black;}
</style>
<body>
<table style='margin:auto;border-collapse:collapsed;'>
<c:forEach items="${arMenu}" var="menu">
	<tr>
		<td>${menu.id}</td><td>${menu.name}</td><td>${menu.price}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>