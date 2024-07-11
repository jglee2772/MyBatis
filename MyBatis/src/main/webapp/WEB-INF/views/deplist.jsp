<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서</title>
</head>
<style>
td { border:1px solid black;}
</style>
<body>
<table style='margin:auto;border-collapse:collapsed;'>
<c:forEach items="${arDep}" var="dep">
	<tr>
		<td>${dep.department_id}</td><td>${dep.department_name}</td><td>${dep.manager_name}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>