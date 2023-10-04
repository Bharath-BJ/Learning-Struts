<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<div align="center">
		<h2>Login Form</h2>
		<s:form action="loginAction">
			<s:textfield name="userName" label="User Name"></s:textfield> 
			<s:textfield name="password" label="Password"></s:textfield>
			<s:submit value="Submit"/>
		</s:form>
	</div>
</body>
</html>