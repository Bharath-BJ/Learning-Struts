<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!-- Above tag is necessary to access the struts tags support & prefix can be any phrase of developer choice 
	 And all struts tag should have prefix:tag-name  as convention 
	 1) Attribute from the action class can be accessed here in jsp by using getter() method in property tag 
	 2) Similiarly, jsp input can also be accessed from the action class by using setter() method for the same input name as attribute of action class
	 Eg: Refer welcome page to understand the passing input from jsp to action class   -->

<html>
<head>
<meta charset="UTF-8">
<title> Success page</title>
</head>
<body>
	<h1>Success page</h1>
	<h1>  <s:property value="message"/>  </h1>
</body>
</html>