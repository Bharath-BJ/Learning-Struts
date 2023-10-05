<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="styles.css"/>
<meta charset="UTF-8">
<title>Add Product Page</title>
</head>
<body>
	<s:form action="addProduct" class="loginForm" >
		<s:textfield name="productId" label="Product Id" class="formTextField"/>
		<s:textfield name="productName" label="Product Name" class="formTextField"/>
		<s:textfield name="productCategory" label="Product Category" class="formTextField"/>
		<s:textfield name="productPrice" label="Product Price" class="formTextField"/>
		<s:submit value="Submit" class="actionBtn"/>
	</s:form>
</body>
</html>