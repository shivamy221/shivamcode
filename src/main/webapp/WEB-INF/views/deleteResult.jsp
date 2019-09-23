<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deleted Employee ${emp.ename} </title>
</head>
<body>
<hr>
<h1 align="center">You Deleted</h1>
<hr>
<pre>
	<p align="center">
	Id     : ${emp.eno}
	Name   : ${emp.ename}
	Branch : ${emp.sal}
	
	</p>
</pre>
	<hr>
	<a href="index.jsp">Home</a>
</body>
</html>