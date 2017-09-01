<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>INSTRUMENT TABLE</h1>

<center><table style="width:100%" border='2'>
<tr><th>id</th><th>title</th><th>author</th><th>songs_albumidentifier</th></tr>
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
</body>
</html>