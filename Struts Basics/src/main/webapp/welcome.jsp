<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>
	<s:form action="testAction"> 
		<s:textarea name="fullName" label="Enter your name"> </s:textarea>
		<s:submit value="Submit"></s:submit>
	</s:form>
</body>
</html>