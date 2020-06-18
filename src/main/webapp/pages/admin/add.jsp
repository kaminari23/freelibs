<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 23.01.2020
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddController</title>
    <style>
        .alert{
            text-align: center;
            font-size: 20px;
            position: relative;
        }
        .button1 {
            text-align: center;
            font-size: 20px;
            position: relative;
            user-select: none;
            text-decoration: none;
        }
    </style>
</head>
<body>
<section>
    <form method="post" action="${pageContext.request.contextPath}/admin/panel/add">
        <dl>
            <dt>Name: </dt>
            <dd><input type="text" name="name" /></dd>
        </dl>
        <dl>
            <dt>Articul: </dt>
            <dd><input type="text" name="articul" /></dd>
        </dl>
        <dl>
            <dt>Picture: </dt>
            <dd><input type="text" name="picture" /></dd>
        </dl>
        <dl>
            <dt>Price: </dt>
            <dd><input type="text" name="price"/></dd>
        </dl>
        <dl>
            <dt>Material: </dt>
            <dd><input type="text" name="material" /></dd>
        </dl>
        <dl>
            <dt>Equipment: </dt>
            <dd><input type="text" name="equipment" /></dd>
        </dl>
        <dl>
            <dt>Cooling: </dt>
            <dd><input type="text" name="cooling" /></dd>
        </dl>
        <dl>
            <dt>Diameter: </dt>
            <dd><input type="text" name="diameter" /></dd>
        </dl>
        <dl>
            <dt>Currency: </dt>
            <dd><input type="text" name="currency" /></dd>
        </dl>
        <dl>
            <dt>Description: </dt>
            <dd><input type="text" name="description" /></dd>
        </dl>
        <dl>
            <dt>Type: </dt>
            <dd><input type="text" name="type" /></dd>
        </dl>

        <button type="submit">Submit</button>
    </form>
</section>
</body>
</html>
