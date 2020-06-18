<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ru">
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
                            <a href="#">
                                Главная
                            </a>
                        </li>
                        <li class="menu__item">
                            <a href="#">
                                Библиотека
                            </a>
                        </li>
                        <li class="menu__item">
                            <a href="#">
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
                            <a href="#">
                                Войти
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

    <section class="content">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="genre">
                        <div class="genre__item">
                            <form method="post" action="${pageContext.request.contextPath}/books">
                                <input hidden name="gid" value="1">
                                <button type="submit" class="item__redir">Фэнтези</button>
                            </form>
                        </div>
                        <div class="genre__item">
                            <form method="post" action="${pageContext.request.contextPath}/books">
                                <input hidden name="gid" value="2">
                                <button type="submit" class="item__redir">Научная фантастика</button>
                            </form>
                        </div>
                        <div class="genre__item">
                            <form method="post" action="${pageContext.request.contextPath}/books">
                                <input hidden name="gid" value="3">
                                <button type="submit" class="item__redir">Драма</button>
                            </form>
                        </div>
                        <div class="genre__item">
                            <form method="post" action="${pageContext.request.contextPath}/books">
                                <input hidden name="gid" value="4">
                                <button type="submit" class="item__redir">Историческое</button>
                            </form>
                        </div>
                        <div class="genre__item">
                            <form method="post" action="${pageContext.request.contextPath}/books">
                                <input hidden name="gid" value="5">
                                <button type="submit" class="item__redir">Экшн</button>
                            </form>
                        </div>
                        <div class="genre__item">
                            <form method="post" action="${pageContext.request.contextPath}/books">
                                <input hidden name="gid" value="6">
                                <button type="submit" class="item__redir">Мрачное фэнтези</button>
                            </form>
                        </div>
                        <div class="genre__item">
                            <form method="post" action="${pageContext.request.contextPath}/books">
                                <input hidden name="gid" value="7">
                                <button type="submit" class="item__redir">Детектив</button>
                            </form>
                        </div>
                        <div class="genre__item">
                            <form method="post" action="${pageContext.request.contextPath}/books">
                                <input hidden name="gid" value="8">
                                <button type="submit" class="item__redir">Психология</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <h1>За даним запитом нічого не знайдено:</h1>
            <div class="row">

                    <div class="col col-md-2">
                        <div class="cnt ">
                            <div class="cnt__item">
                                <h3>Спробуйте змінити критерії пошуку або здійснити пошук за назвою</h3>
                            </div>
                        </div>
                    </div>

            </div>
        </div>
    </section>
</body>
</html>
