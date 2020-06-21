<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ua">
<head>
    <meta charset="UTF-8">
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
                        <a class="menu__lupa" type="submit" ><i class="fas fa-search "></i></a></li>
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


    <c:forEach var="items" items="${item}">
    <section class="bpg">
        <div class="container">
            <div class="row">
                <div class="col-3 col-md-2">
                    <div class="bpg__img d-flex justify-content-center" >
                        <img src="<c:out value="${items.picture}" />" width=100% height="250px">
                    </div>
                </div>
                <div class="col-9 col-md-2">
                    <div class="bpg__name d-flex justify-content-center">
                        <h1><c:out value="${items.name}" /></h1>
                    </div>
                    <div class="bpg__author d-flex justify-content-center">
                        <h2><c:out value="${items.author}" /></h2>
                    </div>
                    <div class="bpg__pubdate d-flex justify-content-center">
                        <h2><c:out value="${items.pubdate}" /></h2>
                    </div>

                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="bpg__annotation d-flex justify-content-center">
                        <h3><c:out value="${items.annotation}" /></h3>
                    </div>
                </div>
            </div>

        </div>
    </section>
        </c:forEach>
</body>
</html>
