<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="highmark.HelloWorld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Highmark Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/home.css">
</head>
<body>
	<h1>
		<%
			HelloWorld helloWorld = new HelloWorld();
		    out.print(helloWorld.testMethod());
		%>
	</h1>
	<img class="center" src="beautifulsmile.jpg" alt="">
	<form action="add" method="get">
		Enter 1st Number: <input type="text" name="num1"><br>
		Enter 2nd Number: <input type="text" name="num2"><br>
		<input type="submit">
		
	</form>
<%
    double num = Math.random();
    if (num > 0.95) {
  %>
      <h2>You'll have a luck day!</h2><p>(<%= num %>)</p>
  <%
    } else {
  %>
      <h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
  <%
    }
  %>
  <a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>

</body>
</html>