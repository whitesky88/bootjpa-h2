<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> let's create a form to fetch a record</h3>
	<form action="list1">
		Student ID: <input type="type" name="id"><br>
		<input type="submit"><br>
	</form>

<h2>record ==> ${obj.id }, ${obj.first }, ${obj.last }, ${obj.lang }</h2>
</body>
</html>