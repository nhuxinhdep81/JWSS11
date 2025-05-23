<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>Thêm danh mục</title>
</head>
<body>
<h2>Thêm danh mục sản phẩm</h2>

<form:form method="post" action="b8_save" modelAttribute="category">
  <table>
    <tr>
      <td><label for="categoryName">Tên danh mục:</label></td>
      <td>
        <form:input path="categoryName"/>
        <br>
        <form:errors path="categoryName" cssStyle="color:red"/>
      </td>
    </tr>

    <tr>
      <td><label>Trạng thái:</label></td>
      <td>
        <form:radiobutton path="status" value="true"/> Hoạt động
        <form:radiobutton path="status" value="false"/> Không hoạt động
        <form:errors path="status" cssStyle="color:red"/>
      </td>
    </tr>



    <tr>
      <td colspan="2">
        <button type="submit">Lưu</button>
      </td>
    </tr>
  </table>
</form:form>

<a href="b8_list">⬅ Quay lại danh sách</a>

</body>
</html>


