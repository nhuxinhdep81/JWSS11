<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 09:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form dang ky nguoi dung</h2>

<form:form modelAttribute="b2DTO" action="b2_add" method="post">
  <div>
    <label for="name">Ten</label>
    <form:input path="name"></form:input>
    <br>
    <form:errors path="name" cssStyle="color:red;"></form:errors>
  </div>

  <div>
    <label for="email">Email</label>
    <form:input path="email"></form:input><br>
    <form:errors path="email" cssStyle="color:red;"></form:errors>
  </div>

  <div>
    <label for="password">mat khau</label>
    <form:input path="password"></form:input><br>
    <form:errors path="password" cssStyle="color:red;"></form:errors>
  </div>

  <div>
    <input type="submit" value="Submit">
  </div>
</form:form>
</body>
</html>
