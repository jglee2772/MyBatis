<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>점수입력</title>
</head>
<style>
table { margin:auto; border-collapse:collapsed;}
td { border:1px solid black;}
</style>
<body>
<form method='post' action='/addscore'>
<table>
<tr><td>이름 :</td><td><input tpye=text name=name></td></tr>
<tr><td>국어점수 :</td><td><input type=text name=kr></td></tr>
<tr><td>영어점수 :</td><td><input type=text name=en></td></tr>
<tr><td>수학점수 :</td><td><input type=text name=mt></td></tr>
<tr><td colspan=2><input type=submit value="추가"></td></tr>
</table>
</form>
</body>
</html>