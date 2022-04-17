<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Valentin
  Date: 03.04.2022
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h2> Product id: ${product.id}</h2>
<h2> Product title: ${product.title}</h2>
<h2> Product cost: ${product.cost}</h2>

<c:url var="findUrl" value="/product/find">
    <c:param name="id" value="${product.id}"/>
</c:url>

<a href="${findUrl}">Find</a>

<br>


</body>
</html>
