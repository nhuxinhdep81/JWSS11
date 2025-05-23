<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 07:08
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>Movie Form</h4>
<form:form modelAttribute="movieDTO" action="movie_save" method="post">
    <div>
        <label for="title">Title</label>
        <form:input path="title"></form:input>
        <br>
        <form:errors path="title" cssStyle="color: red"></form:errors>
    </div>

    <div>
        <label for="email">Email</label>
        <form:input path="email"></form:input>
        <br>
        <form:errors path="email" cssStyle="color: red"></form:errors>
    </div>

    <div>
        <label for="quantity">Quantity</label>
        <form:input path="quantity" type="number"></form:input>
        <br>
        <form:errors path="quantity" cssStyle="color:red;"></form:errors>
    </div>

    <div>
        <label for="birthday">Birthday</label>
        <form:input path="birthday" type="date"></form:input>
        <form:errors path="birthday" cssStyle="color: red"></form:errors>
    </div>

    <div>
        <label for="eventDate">Event Date</label>
        <form:input path="eventDate" type="date"></form:input>
        <form:errors path="eventDate" cssStyle="color: red"></form:errors>
    </div>



    <div>
        <input type="submit" value="Submit">
    </div>
</form:form>
</body>
</html>
