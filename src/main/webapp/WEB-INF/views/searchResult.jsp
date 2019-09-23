<%@ page isELIgnored="false" %>
<html>
<head>
<title>Employee ${emp.eno} }</title>
</head>
<body>
<hr>
<h1 align="center">You Searched</h1>
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