<%@page import="com.demo.pojo.EmpDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- to write java code in JSP using Scriplets -->
<%
 EmpDetails emp = (EmpDetails) request.getAttribute("employee");
%>
 <!--expression  -->
Employee Id:<%=emp.getEmpid() %><br>
Employee Name:<%=emp.getEmpname()%><br>
Employee salary: <%=emp.getEmpsalary() %><br>
Employee Ssn :<%=emp.getEmpssn() %><br>
Employee Address: <%=emp.getEmpaddress() %><br>
</body>
</html>