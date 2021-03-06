<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ua">
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Freelib</title>
    <link href="https://fonts.googleapis.com/css2?family=Oswald&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Balsamiq+Sans&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/webfonts/">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/css/fontawesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/css/all.min.css">
</head>
<body>
<header class="navbar navbar-inverse navbar-fixed-top navbar-sm py-2 mb-4 outline-gm-dark ">
    <div class="container">
        <div class="row">
            <div class="col-4 ml-auto">
                <nav>
                    <ul class="menu d-flex justify-content-center" >
                        <li class="menu__item">
                            <a href="${pageContext.request.contextPath}/list">
                                Головна
                            </a>
                        </li>
                        <li class="menu__item">
                            <a href="#">
                                Бібліотека
                            </a>
                        </li>
                        <li class="menu__item">
                            <a href="${pageContext.request.contextPath}/books">
                                Книги
                            </a>
                        </li>
                    </ul>
                </nav>
            </div>
            <div class="col-4 ml-auto d-flex justify-content-center pr-2 py-1">
                <form method="post" action="${pageContext.request.contextPath}/list" class=menu__form >
                    <li><input name="name" class="menu__string" type="text" >
                        <button class="menu__lupa"  ><i class="fas fa-search " type="submit"></i></button></li>
                </form>
            </div>

            <div class="col-4 ml-auto d-flex justify-content-center">
                <nav>
                    <ul class="menu">
                        <li class="menu__login">
                            <a href="${pageContext.request.contextPath}/pages/admin/admin_login.jsp">
                                Увійти
                            </a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</header>
<section class="hello">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="helov d-flex justify-content-center">
                    <div class="helov__view">
                        <h1>Freelib —</h1>
                        <h3>Тут ви можете шукати книги та залишити свою дуже важливу думку!</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<section class="main">

<%--    <section class="content">--%>
<%--        <div class="container">--%>
<%--            <h1>Останні новинки з жанру Наукова фантастика:</h1>--%>
<%--            <div class="row">--%>

<%--                <div class="col col-md-2">--%>
<%--                    <div class="cnt d-flex justify-content-center">--%>
<%--                        <c:forEach var="items" items="${item}">--%>
<%--                        <div class="cnt__item ">--%>
<%--                            <img src="<c:out value="${items.picture}" />" width=100% height="150px">--%>

<%--                            <form method="post" action="${pageContext.request.contextPath}/bookpage">--%>
<%--                                <input hidden name="name" value="<c:out value="${items.name}" />">--%>
<%--                            <button type="submit" class="item__redir"><c:out value="${items.name}" /></button>--%>
<%--                            </form>--%>
<%--                            <h4><c:out value="${items.author}" /></h4>--%>
<%--                        </div>--%>
<%--                        </c:forEach>--%>
<%--                    </div>--%>
<%--                </div>--%>

<%--            </div>--%>
<%--        </div>--%>
<%--    </section>--%>
    <section class="content">
        <div class="container">
            <h1>Останні новинки:</h1>
            <div class="row">
                <c:forEach var="itemr" items="${itemR}">
                    <div class="col col-md-2">
                        <div class="cnt d-flex justify-content-center">
                            <div class="cnt__item ">
                                <img src="<c:out value="${itemr.picture}" />" width=100% height="150px">
                                    <%--                            <form method="post" action="${pageContext.request.contextPath}/list">--%>
                                    <%--                                --%>
                                <form method="post" action="${pageContext.request.contextPath}/bookpage">
                                    <input hidden name="name" value="<c:out value="${itemr.name}" />">
                                    <button type="submit" class="item__redir"><c:out value="${itemr.name}" /></button>
                                </form>
                                    <%--                            </form>--%>
                                <h3><c:out value="${itemr.author}" /></h3>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </section>
</body>
</html>
