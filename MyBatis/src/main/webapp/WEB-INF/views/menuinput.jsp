<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴입력</title>
</head>
<style>
table { margin:auto; border-collapse:collapsed;}
td { border:1px solid black;}
</style>
<body>
<form method='post' action='/insert'>
<table>
<tr><td>메뉴명 :</td><td><input tpye=text name=name></td></tr>
<tr><td>가격 :</td><td><input type=text name=price></td></tr>
<tr><td colspan=2><input type=submit value="메뉴추가"></td></tr>
</table>
</form>
</body>
</html>