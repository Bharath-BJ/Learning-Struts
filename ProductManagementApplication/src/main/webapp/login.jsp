<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css">
<title>Login Page</title>
</head>
<body>
	<div align="center">
		<h2>Login Form</h2>
		<s:form action="loginAction" class="loginForm">
			<s:textfield name="userName" label="User Name" class="formTextField"></s:textfield> 
			<s:textfield name="password" label="Password" class="formTextField"></s:textfield>
			<s:submit value="Submit" class="actionBtn"/>
		</s:form>
	</div>
</body>
</html>