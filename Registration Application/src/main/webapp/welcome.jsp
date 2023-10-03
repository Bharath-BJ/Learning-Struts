<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<s:label value="First Name"/>
	<s:property value="firstName"></s:property>
	<br/>
	<s:label value="Last Name"/>
	<s:property value="lastName"></s:property>
	<br/>
	<s:label value="Gender"/>
	<s:property value="gender"></s:property>
	<br/>
	<s:label value="Age"/>
	<s:property value="age"></s:property>
	<br/>
	<s:label value="Email"/>
	<s:property value="email"></s:property>
</body>
</html>

<!-- Accessing the values of action class obj stored in ValueStack is possible coz of OGNL -->