<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  background="http://cdn.wallpapersafari.com/52/36/CiQ9qR.jpg">
<h3><a href="view">Home</a></h3>
<center>
<h1>MUSICIAN TABLE</h1>
</center>
<center><table style="width:100%" border='2'>
<tr><th>id</th><th>ssn</th><th>name</th><th>delete</th></tr>
 <c:forEach items="${entries}" var="entry">
  <tr>
  	<td>${entry.id}</td>
    <td>${entry.ssn}</td>
    <td>${entry.name}</td>
    <td><a href="deletemusician?id=${entry.id}">Delete</a></td>
      </tr>
</c:forEach>
  </table>
  <a href="addmusician">add table</a>
  
  </center>

</body>
</html>