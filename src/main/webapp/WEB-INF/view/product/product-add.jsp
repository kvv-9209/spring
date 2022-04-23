<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Valentin
  Date: 03.04.2022
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<c:url var="addUrl" value="/product/add">
    <c:param name="id" value="${product.id}"/>
</c:url>
<form:form action="add" modelAttribute="product">
    <form:hidden path="id" value="${product.id}"/>
    Title: <form:input path="title" />
    <br>
    Cost: <form:input path="cost"/>
    <br>
    <input type="submit" value="Add">
</form:form>
<br>
<a href="${findidUrl}">Find</a>
<br>
<a href="${addUrl}">Add</a>
</body>
</html>
