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
<h1>ALBUM TABLE</h1>
</center>
<center><table style="width:100%" border='2'>
<tr><th>id</th><th>album identifier</th><th>format</th><th>copyright date</th><th>title</th><th>m_ssn</th><th>delete</th></tr>
 <c:forEach items="${entries2}" var="entry2">
  <tr>
  	<td>${entry2.id}</td>
    <td>${entry2.albumidentifier}</td>
    <td>${entry2.format}</td>
    <td>${entry2.copyrightdate}</td>
    <td>${entry2.title}</td>
    <td>${entry2.m_ssn}</td>
    <td><a href="deletealbum?id=${entry2.id}">Delete</a></td>
      </tr>
</c:forEach>
  </table>
  <a href="addalbum">add table</a>
  
  </center>

</body>
</html>