<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Register Form</title>
    <style>
        .error { color: red; }
    </style>
</head>
<body>
<h2>Register</h2>
<form:form modelAttribute="b5DTO" action="/b5_add" method="post">
    <div>
        Name: <form:input path="name" />
        <br>
        <form:errors path="name" cssClass="error" /><br/>
    </div>
    <div>
        Email: <form:input path="email" />
        <br>
        <form:errors path="email" cssClass="error" /><br/>
    </div>
    <div>
        Password: <form:password path="password" />
        <br>
        <form:errors path="password" cssClass="error" /><br/>
    </div>
    <div>
        Role:
        <form:select path="role">
            <form:option value="user">User</form:option>
            <form:option value="admin">Admin</form:option>
        </form:select>
        <br>
        <form:errors path="role" cssClass="error" /><br/>
    </div>
    <div>
        Department (admin only): <form:input path="department" />
        <br>
        <form:errors path="department" cssClass="error" /><br/>
    </div>
    <div>
        <input type="submit" value="Register"/>
    </div>
</form:form>
</body>
</html>
