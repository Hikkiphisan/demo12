<%--
  Created by IntelliJ IDEA.
  User: Mr Loc
  Date: 12/3/2024
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>List</h1>
  <table>
      <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Email</th>
          <th>Country</th>
      </tr>

          <c:forEach var="customer" items="${customerList}">
              <tr>
              <td>${customer.id}</td>
              <td>${customer.name}</td>
              <td>${customer.email}</td>
              <td>${customer.country}</td>
              </tr>
          </c:forEach>

  </table>
</body>
</html>
