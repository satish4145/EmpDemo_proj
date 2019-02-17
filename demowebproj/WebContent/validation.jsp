<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function validate() {
	
	var ename = document.getElementById("eid").value;
	if (ename==null || ename=='')
		{
	alert('Please enter student name');
	
}
	
	
	
	
	
}



</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<select>
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>

Employee name: <input type="text" name="sid" id = "eid"></input> 
<input type="button" value="submit"  onclick="validate()" 	></input>
 <div style="margin: 0 auto;" align="center">
 
 

<table border="2" bgcolor="Yellow" style="color: blue">

 
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
Employee Address
</th>

</tr>

<tr>
<td>
123
</td>
<td>
Satish
</td>
<td>
100000
</td>
<td>
Temple
</td>

</tr>

<tr>
<td>
123
</td>
<td>
Satish
</td>
<td>
100000
</td>
<td>
Temple
</td>

</tr>

<tr>
<td>
123
</td>
<td>
Satish
</td>
<td>
100000
</td>
<td>
Temple
</td>

</tr>

<tr>
<td>
123
</td>
<td>
Satish
</td>
<td>
100000
</td>
<td>
Temple
</td>

</tr>


</table>

</div>


</body>
</html>


