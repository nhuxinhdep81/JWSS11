<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 08:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form nhap thong tin</h2>
<form:form modelAttribute="b1DTO" action="b1_add" method="post">
    <div>
        <label for="name">Ten:</label>
        <form:input path="name"></form:input>
        <br>
        <form:errors path="name" cssStyle="color: red"></form:errors>
    </div>

    <div>
        <label for="email">Email:</label>
        <form:input path="email"></form:input>
        <br>
        <form:errors path="email" cssStyle="color: red"></form:errors>
    </div>

    <div>
        <label for="phone">SDT:</label>
        <form:input path="phone"></form:input>
        <br>
        <form:errors path="phone" cssStyle="color: red"></form:errors>
    </div>

    <div>
        <label for="password">Mat khau:</label>
        <form:input path="password"></form:input>
        <br>
        <form:errors path="password" cssStyle="color: red"></form:errors>
    </div>

    <div>
        <label for="status">Trang thai:</label>
        <form:input path="status"></form:input>
        <br>
        <form:errors path="status" cssStyle="color: red"></form:errors>
    </div>

    <div>
        <input type="submit" value="Submit">
    </div>
</form:form>
</body>
</html>
