<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getallproductslist" method = "get">
<table>
 
   <tbody>
     	<tr>
   	    	<td> Product Type : </td>
   		    <td> 
   		       <select name ="ptype">
   		         <option>Electronics</option>
   		  		 <option>Pharmacy</option>
   		  		 <option>Groceries</option>
   		 		 <option>Dairy</option>
   		  		 <option>Furniture</option>  
   		  		</select>
   	     	</td>
        </tr>
    
  

 </tbody>

 </table>
 
 <input type = "submit" value = "Submit" name = "submit" >
 <input type = "reset" value = "Clear" name = "clear"> 
 </form>
</body>
</html>