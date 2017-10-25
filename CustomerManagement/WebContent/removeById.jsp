<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="removeSubmission.cus" method="post">
<table>
<tr><td>Enter Customer Id:</td>
<td>
<select id="custId" name="custId">

<c:forEach items="${idList}" var="list">
	<option value="${list}">${list}</option>
</c:forEach>
</select>
</td>
<td><form:errors path="custId" cssErrorClass="error"></form:errors></td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table>
</form:form>
</body>
</html>