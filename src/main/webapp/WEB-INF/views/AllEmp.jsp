<%@ page isELIgnored = "false" %>
<%@ page import=" java.util.List"%> 
<%@ page import="com.worldpay.model.EmpModel" %>
<% List<EmpModel> EmpList = (List<EmpModel>)request.getAttribute("EmpList") ;%>

<html>
<head>
<title>All Employees</title>
</head>
<body>
<hr>
<h4>All Employee</h4>
<table>
<tr><th>Employee no.   </th><th>  Employee name  </th><th>  Salary   </th></tr>
<% for(EmpModel emp:EmpList){ %>
<tr><td><%=emp.getEno()%></td>
<td><%=emp.getEname()%></td>
<td><%=emp.getSal()%></td></tr>
<%} %>
</table>
<hr>
<a href="index.jsp">Back Home</a>
<hr>
</body>
</html>