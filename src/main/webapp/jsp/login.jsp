<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${message}
	<form:form id="login" modelAttribute="login" action="loginProcess"
		method="post">
		<h1>Login Page</h1>
		<div align="center">
			<table>
				<tr>
					<td>UserName:</td>
					<td><form:input path="userName" name="userName"
							required="required" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><form:password path="password" name="password"
							required="required" /></td>
				</tr>
				<tr>
					<td><input type="submit" name="login" value="Login"></td>
					<td><a href="register">Don't have an account? Create one!</a></td>
				</tr>
			</table>
		</div>
	</form:form>
</body>
</html>