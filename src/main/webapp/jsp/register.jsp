
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
	${msg}
	<form:form id="register" modelAttribute="user" action="registerProcess"
		method="post">
		<h1>Create an Account</h1>
		<div align="center">
			<table>
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" name="firstName"
							required="required" /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" name="lastName"
							required="required" /></td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td><form:input path="email" name="email"
							pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
							title="Please enter valid email address" required="required" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><form:input path="address" name="address"
							required="required" /></td>
				</tr>
				<tr>
					<td>Mobile No:</td>
					<td><form:input path="phone" name="Phone Number"
							maxlength="10" pattern="[7-9]{1}[0-9]{9}"
							title="Phone number must start from 7,8 or 9 with 10 digits"
							required="required" /></td>
				</tr>
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
					<td><input type="reset" name="Reset"></td>
				</tr>
				<tr>
					<td><input type="submit" name="submit" value="Register"></td>
					<td><a href="login"> Already a User? Login</a></td>
				</tr>
			</table>
		</div>
	</form:form>
</body>
</html>