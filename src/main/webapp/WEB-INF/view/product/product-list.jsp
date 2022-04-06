<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Product List</title>
</head>
<body>
<h1>Product List:</h1>
<ul>
    <c:forEach var="product" items="${products}">
        <c:url var="viewUrl" value="/product/ + ${product.id}"/>
        <li>
            <a href="${viewUrl}">View</a>
            <br>
            Product id: ${product.id}
            <br>
            Product title: ${product.title}
            <br>
            Cost: ${product.cost}
            <br>
        </li>
    </c:forEach>
</ul>
<br>
<c:url var="addUrl" value="/product/add"/>
<a href="${addUrl}">Add</a>
<br>
<c:url var="findbyidUrl" value="/product/{id}"/>
<a href="${findbyidUrl}">Find</a>
<br>
<%--<form:form action="findbyid" modelAttribute="product">--%>
<%--&lt;%&ndash;    <form:hidden path="id" value="${product.id}"/>&ndash;%&gt;--%>
<%--    Enter ID: <form:input path="{id}" value="${product.id}"/>--%>
<%--    <br>--%>
<%--    <input type="submit" value="Find">--%>
<%--</form:form>--%>
</body>
</html>