<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원 찾기</title>
</head>
<body>
<form method=post action="/search">
<table style='margin:auto'>
<tr><td>사번 :</td><td><input type=text name='eid'></td></tr>
<tr><td colspan=2><input type=submit value='찾기'></td></tr>
</table>
</form>
</body>
</html>