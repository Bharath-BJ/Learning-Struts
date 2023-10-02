<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Following tag is necessary to access the struts tags support & prefix can be any phrase of developer choice 
	 And all struts tag should have prefix:tag-name  as convention -->
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta charset="UTF-8">
<title>Error page</title>
</head>
<body>
	<h1>Error page</h1>
	<h1>  <s:property value="message"/>  </h1>
</body>
</html>