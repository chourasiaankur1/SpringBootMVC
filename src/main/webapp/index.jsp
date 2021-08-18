<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome Ankur!!!!
	Add an alien
	<form action="addAlien" method="post">
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="submit">
	</form>
	Get an Alien by Id
	<form action="getAlien" method="get">
		<input type="text" name="aid"><br>
		<input type="submit">
	</form>
	Get an Alien by Name
	<form action="getAlienByName" method="get">
		<input type="text" name="aname"><br>
		<input type="submit">
	</form>
	Remove an Alien by Id
	<form action="removeAlien" method="aid">
		<input type="text" name="aid"><br>
		<input type="submit">
	</form>
</body>
</html>