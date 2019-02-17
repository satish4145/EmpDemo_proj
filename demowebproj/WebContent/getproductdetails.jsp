<%@page import="com.demo.pojo.ProductPojo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<%ProductPojo pp = (ProductPojo)request.getAttribute("product") ;%>
 <center>
 <h1>Kalyan Super Market</h1>
 <h1>Product Details</h1>
	<table>
		<tr>
			<td>
 				Product Item     : <%=pp.getProductitemno() %>
			</td>
		</tr>

		<tr>
			<td>
 				Product Type     : <%=pp.getProducttype() %>
			</td>
		</tr>


		<tr>
			<td>
				 Product Name     : <%=pp.getProductname() %>
			</td>
		</tr>

		<tr>
			<td>
				 Product Price    : <%=pp.getProductprice() %>
			</td>
		</tr>

		<tr>
			<td>
				 Product Warranty : <%=pp.getProductwarrantydetails() %>
			</td>
		</tr>
</table>
</center>

</body>
</html>