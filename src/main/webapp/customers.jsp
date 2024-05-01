<%--
  Created by IntelliJ IDEA.
  User: pttha
  Date: 2024-05-01
  Time: 4:48 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>danh sach</h1>
<table>
    <c:forEach var="customer" items="${customers}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.dob}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img}" alt="hinh anh"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
