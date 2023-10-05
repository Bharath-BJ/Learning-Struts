<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles.css">
<title>Welcome Page</title>
</head>
<body>
	<div align="center">
		<h2>Welcome Page</h2>
		<a href="addProduct.jsp">
			<button class="actionBtn"> Add Product</button>
		</a>
		<table width=750 class="productTable" align="center">
			<thead>
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Product Category</th>
					<th>Product Price</th>
					<th colspan=2 >Actions</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="products" var="product">
					<tr>
						<td>
							<s:property value="#product.productId" />
						</td>
						<td>
							<s:property value="#product.productName" />
						</td>
						<td>
							<s:property value="#product.productCategory" />
						</td>
						<td>
							<s:property value="#product.productPrice" />
						</td>
						<td>Update</td>
						<td>Delete</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
		
	</div>
</body>
</html>