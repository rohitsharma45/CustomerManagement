<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr><td>${d.custId}</td></tr>
<tr><td>${d.custName}</td></tr>
<tr><td>${d.custPhone}</td></tr>
<tr><td>${d.custEmail}</td></tr>
<tr><td>${d.custDob}</td></tr>
</table>
</body>
</html>