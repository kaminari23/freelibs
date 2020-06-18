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
    <title>Delete Controller</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/admin/panel/delete">
    <h3>Delete object by selected id</h3>
    <input  name="id">
<%--<h3 class="alert">Object was deleted!</h3>--%>
    <button type="submit">Delete</button>

</form>
</body>
</html>
