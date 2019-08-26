<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update" method="post">
		Student ID:<input type="text" name="id"><br>
		First name:<input type="text" name="first"><br>
		Last Name:<input type=text" name="last"><br>
		Language<input type="text" name="lang"><br>
		Update<input type="submit"><br>
	</form>
	
	Updated: ${obj.id }, ${obj.first}, ${obj.last}, ${obj.lang }
</body>
</html>