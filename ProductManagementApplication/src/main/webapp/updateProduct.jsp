<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css"/>
<title>Update Page</title>
</head>
<body>
	<h2>Update your product</h2>
	<s:form action="updateAction" class="formTable">
		<s:textfield name="productId" label="Product Id" class="formTextField" readonly="true"/>
		<s:textfield name="productName" label="Product Name" class="formTextField"/>
		<s:textfield name="productCategory" label="Product Category" class="formTextField"/>
		<s:textfield name="productPrice" label="Product Price" class="formTextField"/>
		<s:submit value="Update" class="actionBtn"/>
	</s:form>
</body>
</html>