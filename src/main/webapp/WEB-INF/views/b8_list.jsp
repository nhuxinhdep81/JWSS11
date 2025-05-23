<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%--
  Created by IntelliJ IDEA.
  User: lemanh
  Date: 23/05/2025
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Danh sách danh mục</title>
</head>
<body>
<h2>Danh sách danh mục</h2>

<a href="b8_form">➕ Thêm danh mục mới</a>
<br/><br/>

<table border="1" cellpadding="10" cellspacing="0">
  <tr>
    <th>ID</th>
    <th>Tên danh mục</th>
    <th>Trạng thái</th>
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
    </tr>
  </c:forEach>
</table>

</body>
</html>

