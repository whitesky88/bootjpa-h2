<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to lab1</title>
</head>
<body>
<h2> The goal is to use Model/Control/View and in-mem H2 DB</h2>
<h3> let's create a form used in lab1</h3>
	<form action="AddData">
		Student ID: <input type="text" name="id"><br>
		First Name: <input type="text" name="first"><br>
		Last Name:  <input type="text" name="last"><br>
		Language:   <input type="text" name="lang"><br>
		<input type="submit"><br>
	</form>
	
<h3> 1. require web, jpa, h2</h3>
<h3> 2. code structure </h3>
*.data		  ==> classes to model the data<br>
*.controller  ==> classes to handle the data and views<br>
*.dao		  ==> interfaces to built-in CRUD ops<br>
webapp/labs/* ==> resources to model the views<br>
<h3> 3. set view mapping</h3>
spring.mvc.view.prefix=/labs/<br>
spring.mvc.view.suffix=.jsp<br>
<h3> 4. set h2 config</h3>
spring.h2.console.enabled=true<br>
spring.datasource.platform=h2<br>
spring.datasource.url=jdbc:h2:mem:lab1<br>


</body>
</html>