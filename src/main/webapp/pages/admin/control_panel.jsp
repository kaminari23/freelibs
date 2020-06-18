<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Admin panel</title>
    <style>
        .tbl{
            margin-left:15%;
            text-align: center;
            font-size:20px;
        }
        .add{
            text-decoration: none;
            color:black;
            position: relative;

        }
        .add:hover{
            background: azure;
        }
        .delete{
            text-decoration: none;
            color:black;
            position: relative;

        }
        .delete:hover{
            background: azure;
        }
        .update{
            text-decoration: none;
            color:black;
            position: relative;

        }
        .update:hover{
            background: azure;
        }
        /*.navi {*/
        /*    height:20%;*/
        /*    width:20%;*/
        /*    display:flex;*/
        /*    justify-content: flex-end;*/
        /*    flex-direction: column;*/
        /*}*/
    </style>
</head>
<body>
<%--<div class="navi">--%>
<%--    <a class="add" href ='<c:url value="/admin/panel/add"/>'>Add</a>--%>
<%--    <form method="post" action="${pageContext.request.contextPath}/admin/panel">--%>
<%--        <h3>Find objects by name</h3>--%>
<%--        <input  name="name">--%>
<%--        <button type="submit">Find</button>--%>
<%--    </form>--%>
<%--    <a href='<c:url value="/admin/panel" />'>Show all</a>--%>
<%--</div>--%>

<div class="content">

    <c:forEach var="items" items="${item}">
        <h3><c:out value="${items.uname}" /></h3>
    </c:forEach>
</div>
</body>
</html>