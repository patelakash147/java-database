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
<h1> MUSICIAN TABLE</h1>
</center>
<center><table style="width:100%" border='2'>
<tr><th>id</th><th>ssn</th><th>name</th></tr>
 <c:forEach items="${entries}" var="entry">
  <tr>
  	<td>${entry.id}</td>
    <td>${entry.ssn}</td>
    <td>${entry.name}</td>
      </tr>
</c:forEach>
  </table>
  </center>
  <center>
<h1> ALBUM TABLE</h1>
</center>
<center><table style="width:100%" border='2'>
<tr><th>id</th><th>album identifier</th><th>format</th><th>copyright date</th><th>title</th><th>m_ssn</th></tr>
 <c:forEach items="${entries2}" var="entry2">
  <tr>
  	<td>${entry2.id}</td>
    <td>${entry2.albumidentifier}</td>
    <td>${entry2.format}</td>
    <td>${entry2.copyrightdate}</td>
    <td>${entry2.title}</td>
    <td>${entry2.m_ssn}</td>
    
      </tr>
</c:forEach>
  </table>
 
  
  </center>
  <center>
<h1>SONG TABLE</h1>
</center>
<center><table style="width:100%" border='2'>
<tr><th>id</th><th>title</th><th>author</th><th>songs_albumidentifier</th></tr>
 <c:forEach items="${entries1}" var="entry1">
  <tr>
  	<td>${entry1.id}</td>
    <td>${entry1.title}</td>
    <td>${entry1.author}</td>
    <td>${entry1.songs_albumidentifier}</td>
   
      </tr>
</c:forEach>
  </table>
   
  </center>
  <center>
<h1>INSTRUMENT TABLE</h1>
<table style="width:100%" border='2'>
<tr><th>id</th><th>name</th><th>i_key</th><th>m_ssn</th></tr>
 <c:forEach items="${entries3}" var="entry3">
  <tr>
  	<td>${entry3.instrument_id}</td>
    <td>${entry3.name}</td>
    <td>${entry3.i_key}</td>
    <td>${entry3.m_ssn}</td>
   
      </tr>
</c:forEach>
  </table>
  </center>
   
  
  <center>
<h1>PLACE TABLE</h1>
</center>
<center><table style="width:100%" border='2'>
<tr><th>id</th><th>address</th><th>phone_number</th></tr>
 <c:forEach items="${entries4}" var="entry4">
  <tr>
  	<td>${entry4.place_id}</td>
    <td>${entry4.address}</td>
    <td>${entry4.phone_number}</td>
   
   
      </tr>
</c:forEach>
  </table>
   
  </center>
  

</body>
</html>