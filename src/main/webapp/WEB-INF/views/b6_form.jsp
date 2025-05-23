<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>CHeck dinh dang SDT</h2>
<form:form modelAttribute="b6DTO" action="/b6_add" method="post">
    <div>
        Phone: <form:input path="phone" />
        <br>
        <form:errors path="phone" cssStyle="color:red;"/><br/>
    </div>
    <div>
        <input type="submit" value="Check"/>
    </div>
</form:form>
</body>
</html>
