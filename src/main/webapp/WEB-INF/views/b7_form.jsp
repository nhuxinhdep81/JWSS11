<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>Product Review</title>
  <style>
    .error { color: red; }
  </style>
</head>
<body>
<h2>Product Review</h2>
<form:form modelAttribute="b7DTO" action="/b7_add" method="post">
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
    Rating (1-5): <form:input path="rating" type="number" />
    <br>
    <form:errors path="rating" cssClass="error" /><br/>
  </div>
  <div>
    Comment: <form:textarea path="comment" rows="4" cols="50" />
    <br>
    <form:errors path="comment" cssClass="error" /><br/>
  </div>
  <div>
    <input type="submit" value="Submit Review"/>
  </div>
</form:form>
</body>
</html>
