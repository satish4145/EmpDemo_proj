<%@page import="com.demo.pojo.ProductPojo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
     <%  ArrayList productrec =(ArrayList)request.getAttribute("product"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>



 
<body bgcolor="white">

   <div style="margin: 0 auto;" align="center">
   <h1>Kalyan Super Market</h1>
<table border="2" bgcolor="white" style="color: black">  
 <tr>
<th>
Product Item
</th>
<th>
Product Type
</th>
<th>
Product Name
</th>
<th>
Product Price
</th>
<th>
Product Warranty
</th>
</tr>
<% for (int reccount = 0; reccount<productrec.size(); reccount++){ %>

<tr>
	<% ProductPojo pj = (ProductPojo)productrec.get(reccount); %>
		<td>
			<%=pj.getProductitemno() %>
		</td>
		<td>
			<%=pj.getProducttype() %>
		</td>
		<td>
			<%=pj.getProductname() %>
		</td>
		<td>
			<%=pj.getProductprice() %>
		</td>
		<td>
			<%=pj.getProductwarrantydetails() %>
		</td>


 </tr>
<% }%>
</table>
</div>
</body>
</html>