<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<form method=post action="/searchname">
<table style='margin:auto'>
<tr><td>단어 :</td><td><input type=text name='en'></td></tr>
<tr><td colspan=2><input type=submit value='찾기'></td></tr>
</table>
</form>
</body>
</html>