<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
td { border:1px solid black;}
</style>
<body>
<table style='margin:auto; border-collapse:collapsed;'>
<c:forEach items="${workername}" var="worker">
<tr>
	<td>${worker.employee_id}</td><td>${worker.emp_name}</td><td>${worker.salary}</td>
</tr>
</c:forEach>
</table>
</body>
</html>