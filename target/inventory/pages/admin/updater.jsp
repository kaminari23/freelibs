<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 23.01.2020
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Updater</title>
</head>
<body>

<section>
    <%--    <jsp:useBean id="add1" scope="request" type="ua.com.distar.adviser.singleton.Adlist"/>--%>
        <table class="tbl" border="1">
            <caption>Table of all items</caption>
            <tr>
                <th>Id</th>
                <th>Articul</th>
                <th>Name</th>
                <th>Picture</th>
                <th>Price</th>
                <th>Material</th>
                <th>Equipment</th>
                <th>Cooling</th>
                <th>Diameter</th>
                <th>Currency</th>
                <th>Description</th>
                <th>Type</th>
            </tr>
    <form method="post" action="${pageContext.request.contextPath}/admin/panel/update">
        <c:forEach var="items" items="${item}">
<tr>
            <td><input  name="id" value="<c:out value="${items.id}" />"></td>
            <td><input  name="articul" value="<c:out value="${items.articul}" />"></td>
            <td><input  name="name" value="<c:out value="${items.name}" />"></td>
            <td><input  name="picture" value="<c:out value="${items.picture}" />"></td>
            <td><input  name="price" value="<c:out value="${items.price}" />"></td>
            <td><input  name="material" value="<c:out value="${items.material}" />"></td>
            <td><input  name="equipment" value="<c:out value="${items.equipment}" />"></td>
            <td><input  name="cooling" value="<c:out value="${items.cooling}" />"></td>
            <td><input  name="diameter" value="<c:out value="${items.diameter}" />"></td>
            <td><input  name="currency" value="<c:out value="${items.currency}" />"></td>
            <td><input  name="description" value="<c:out value="${items.description}" />"></td>
            <td><input  name="type" value="<c:out value="${items.type}" />"></td>
</tr>
        </c:forEach>
        <button type="submit">Save changes</button>
    </form>
        </table>
</section>
</body>
</html>
