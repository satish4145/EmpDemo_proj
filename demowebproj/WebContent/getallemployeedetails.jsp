<%@page import="java.util.ArrayList"%>
<%@page import = "com.demo.pojo.EmpDetails" %>

 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%  ArrayList empRec =(ArrayList)request.getAttribute("employee");%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="white">
  <marquee>Employee Details </marquee>
   <div style="margin: 0 auto;" align="center">
 <table border="2" bgcolor="Skyblue" style="color: black">
 <tr>
<th>
Employee Id
</th>
<th>
Employee Name
</th>
<th>
Employee Salary
</th>
<th>
Employee SSN
</th>
<th>
Employee Address
</th>

</tr>
 
 <%for (int recordcnt = 0; recordcnt <empRec.size(); recordcnt++) {%>


<tr>
     <% EmpDetails emp = (EmpDetails) empRec.get(recordcnt); %>
     <td>
     <%= emp.getEmpid()   %> 
     </td>
     <td>
     <%=emp.getEmpname() %>
     </td>
     <td>
     <%=emp.getEmpsalary() %>
     </td>
     <td>
     <%=emp.getEmpssn() %>
     </td>
     
     <td>
     <%=emp.getEmpaddress() %>
     </td>     
      
</tr>
  <%} %>
</table>
</div>
</body>
</html>