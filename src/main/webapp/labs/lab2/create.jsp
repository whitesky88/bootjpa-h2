<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> let's create a form used in lab2</h3>
	<form action="create">
		Student ID: <input type="text" name="id"><br>
		First Name: <input type="text" name="first"><br>
		Last Name:  <input type="text" name="last"><br>
		Language:   <input type="text" name="lang"><br>
		<input type="submit"><br>
	</form>
	
	Created: ${obj.id}, ${obj.first}, ${obj.last}, ${obj.lang}
</body>
</html>