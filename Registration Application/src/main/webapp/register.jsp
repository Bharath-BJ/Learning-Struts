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
	<s:head/> <!-- s:head tag is necessary to provide some default styling for validation -->
	<h2>Registration page</h2>
	<s:form action="registerAction">
		<s:textfield name="firstName" key="global.firstName" />
		<s:textfield name="lastName" key="global.lastName"/>
		<s:radio name="gender" list="{'male','female'}" key="global.gender"/>
		<s:textfield name="age" key="global.age"/>
		<s:textfield name="email" key="global.email"/>
		<s:submit key="global.register"/>
	</s:form>
	
	<!-- From s:url we generate the link as Registration_Application/changeLocaleAction/request_locale=en/fr/de
		 which is directed to ChangeLocaleAction class to render that language page -->
	<s:url action="changeLocaleAction" var="urlEn">
		<s:param name="request_locale"> en </s:param>
	</s:url>
	<a href="${urlEn}"> English</a>
	
	<s:url action="changeLocaleAction" var="urlFr">
		<s:param name="request_locale"> fr </s:param>
	</s:url>
	<a href="${urlFr}"> French</a>
	
	<s:url action="changeLocaleAction" var="urlDe">
		<s:param name="request_locale"> de </s:param>
	</s:url>
	<a href="${urlDe}"> German</a>
	
</body>
</html>

<!-- ValueStack - Storage area for app specific data for processing the request
	 OGNL(Obj graph navigation lang) - Expression lang to access and manipulate the data in ValueStack
	 Interceptors - Struts components which are invoked before and after invocation for providing pre or post processing the action (Cross-cutting tasks)
	
	 When the action class is invoked it's obj created and stored in ValueStack 
	 Then it's instance variables are loaded with the req parameters by params interceptor using OGNL 
	 There are many more interceptor like Validation, ConversionError etc..-->