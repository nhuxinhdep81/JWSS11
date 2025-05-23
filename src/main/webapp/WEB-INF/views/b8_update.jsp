<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Cập nhật danh mục</title>
    <style>
        .error {
            color: red;
        }
        .form-group {
            margin-bottom: 12px;
        }
    </style>
</head>
<body>
<h2>Cập nhật danh mục sản phẩm</h2>

<form:form action="${pageContext.request.contextPath}/b8_update" modelAttribute="category" method="post">
    <form:hidden path="id"/>

    <div class="form-group">
        <label for="categoryName">Tên danh mục:</label>
        <form:input path="categoryName" id="categoryName"/>
        <form:errors path="categoryName" cssClass="error"/>
    </div>

    <div class="form-group">
        <label>Trạng thái:</label>
        <form:radiobutton path="status" value="true"/> Hoạt động
        <form:radiobutton path="status" value="false"/> Không hoạt động
    </div>

    <form:errors path="status" cssClass="error"/>

    <div class="form-group">
        <button type="submit">Cập nhật</button>
        <a href="${pageContext.request.contextPath}/b8_list">Hủy</a>
    </div>
</form:form>

</body>
</html>

