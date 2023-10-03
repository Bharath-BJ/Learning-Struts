<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<title> Registration Page</title>
</head>
<body>
	<s:head/>
	<h2>Registration page</h2>
	<s:form action="registerAction">
		<s:textfield name="firstName" label="First name" />
		<s:textfield name="lastName" label="Last name"/>
		<s:radio name="gender" list="{'male','female'}" label="Gender"/>
		<s:textfield name="age" label="Age"/>
		<s:textfield name="email" label="Email"/>
		<s:submit value="Register"/>
	</s:form>
	
</body>
</html>

<!-- ValueStack - Storage area for app specific data for processing the request
	 OGNL(Obj graph navigation lang) - Expression lang to access and manipulate the data in ValueStack
	 Interceptors - Struts components which are invoked before and after invocation for providing pre or post processing the action (Cross-cutting tasks)
	
	 When the action class is invoked it's obj created and stored in ValueStack 
	 Then it's instance variables are loaded with the req parameters by params interceptor using OGNL 
	 There are many more interceptor like Validation, ConversionError etc..-->