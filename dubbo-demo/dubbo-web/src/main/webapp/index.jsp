<%--
  Created by IntelliJ IDEA.
  User: YuMengMeng
  Date: 2022/10/17
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>

<form>
    <p>username：<input name="username"></p>
    <p>password：<input name="password" type="password"></p>
    <p>phone：<input name="phone"></p>
    <p><input type="button" id="btn" value="register"></p>
</form>

<script>
    $("#btn").on("click", function () {
        $.post("register", $("form").serialize(), function (result) {
            alert(result)
        }, "json");
    });
</script>


</body>
</html>
