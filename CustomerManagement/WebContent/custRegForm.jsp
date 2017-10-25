<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="register.cus" modelAttribute="beanObj" commandName="beanObj" method="post">
<table border=5 bgcolor="yellow" align="center">
<tr><td>Customer Id</td><td><form:input path="custId"/>
<form:errors path="custId" cssClass="error"></form:errors>
</td></tr>
<tr><td>Customer Name</td><td><form:input path="custName"/>
<form:errors path="custName"></form:errors>
</td></tr>
<tr><td>Customer Phone</td><td><form:input path="custPhone"/>
<form:errors path="custPhone" cssClass="error"></form:errors>
</td></tr>
<tr><td>Customer Email</td><td><form:input path="custEmail"/>
<form:errors path="custEmail" cssClass="error"></form:errors>
</td></tr>
<tr><td>Customer DOB</td><td><form:input path="custDob"/>
<form:errors path="custDob" cssClass="error"></form:errors>
</td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table>
</form:form>
</body>
</html>
<!-- 
<tr><td>Customer Name</td><td><input type="text" id="custName" name="custName"></td></tr>
<tr><td>Customer Id</td><td><input type="text" id="custId" name="custId"></td></tr>
<tr><td>Customer Phone</td><td><input type="text" id="custPhone" name="custPhone"></td></tr>
<tr><td>Customer Email</td><td><input type="text" id="custEmail" name="custEmail"></td></tr>
<tr><td>Customer DOB</td><td><input type="text" id="custDob" name="custDob"></td></tr> -->