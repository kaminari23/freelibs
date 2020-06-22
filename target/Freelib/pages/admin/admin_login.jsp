<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 30.01.2020
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Freelib</title>
    <link href="https://fonts.googleapis.com/css2?family=Oswald&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Balsamiq+Sans&display=swap" rel="stylesheet">
    <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/admin/vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/admin/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/admin/fonts/iconic/css/material-design-iconic-font.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/admin/vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/admin/vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/admin/vendor/animsition/css/animsition.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/admin/vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/admin/vendor/daterangepicker/daterangepicker.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/pages/admin/css/util.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/webfonts/">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/css/fontawesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/admin/css/all.min.css">
</head>

<body>


<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
    <div class="wrap-login100 p-l-55 p-r-55 p-t-80 p-b-30">
        <form method="post" action="${pageContext.request.contextPath}/pages/common/listauthorized.jsp" class="login100-form validate-form">
				<span class="login100-form-title p-b-37">
					Увійти
				</span>

            <div class="wrap-input100 validate-input m-b-20" data-validate="Введіть ім'я користувача">
                <input class="input100" type="text" name="uname" placeholder="ім'я користувача">
                <span class="focus-input100"></span>
            </div>

            <div class="wrap-input100 validate-input m-b-25" data-validate = "Введіть пароль">
                <input class="input100" type="text" name="upass" placeholder="пароль">
                <span class="focus-input100"></span>
            </div>

            <div class="container-login100-form-btn">
                <button type="submit" class="login100-form-btn" >
                    Увійти
                </button>
            </div>

        </form>
        <div class="text-center">
            <a href="${pageContext.request.contextPath}/register" class="txt2 hov1">
                Реєстрація
            </a>
        </div>
        <div class="text-center">
            <a href="${pageContext.request.contextPath}/list" class="txt2 hov1">
                Продовжити без входу
            </a>
        </div>

    </div>
</div>



<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
<script src="${pageContext.request.contextPath}/pages/admin/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="${pageContext.request.contextPath}/pages/admin/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="${pageContext.request.contextPath}/pages/admin/vendor/bootstrap/js/popper.js"></script>
<script src="${pageContext.request.contextPath}/pages/admin/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="${pageContext.request.contextPath}/pages/admin/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="${pageContext.request.contextPath}/pages/admin/vendor/daterangepicker/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/pages/admin/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="${pageContext.request.contextPath}/pages/admin/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
<script src="${pageContext.request.contextPath}/pages/admin/js/main.js"></script>

</body>
</html>
