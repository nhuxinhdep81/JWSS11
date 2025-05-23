
<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Danh sách danh mục</title>
  <style>
    table {
      width: 60%;
      border-collapse: collapse;
    }
    th, td {
      padding: 8px 12px;
      text-align: left;
    }
    th {
      background-color: #f0f0f0;
    }
    .btn {
      padding: 5px 10px;
      text-decoration: none;
      margin: 0 3px;
      border-radius: 4px;
    }
    .edit-btn {
      background-color: #4CAF50;
      color: white;
    }
    .delete-btn {
      background-color: #f44336;
      color: white;
    }
  </style>
</head>
<body>

<h2>📋 Danh sách danh mục</h2>

<a href="b8_form" class="btn edit-btn">➕ Thêm danh mục mới</a>
<br/><br/>

<table border="1" cellpadding="10" cellspacing="0">
  <tr>
    <th>ID</th>
    <th>Tên danh mục</th>
    <th>Trạng thái</th>
    <th>Hành động</th>
  </tr>
  <c:forEach var="c" items="${categories}">
    <tr>
      <td>${c.id}</td>
      <td>${c.categoryName}</td>
      <td>
        <c:choose>
          <c:when test="${c.status}">✔ Kích hoạt</c:when>
          <c:otherwise>✖ Vô hiệu</c:otherwise>
        </c:choose>
      </td>
      <td>
        <a href="b8_edit/${c.id}" class="btn edit-btn">✏ Sửa</a>
        <a href="b8_delete/${c.id}" class="btn delete-btn" onclick="return confirm('Bạn có chắc chắn muốn xoá danh mục này không?');">🗑 Xoá</a>
      </td>
    </tr>
  </c:forEach>
</table>

</body>
</html>


