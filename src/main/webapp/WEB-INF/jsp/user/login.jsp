<%--
  Created by IntelliJ IDEA.
  User: guoyc5
  Date: 2017/8/29
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <h1>UserLogin</h1>
    <hr/>
    <form:form action="loginValidate" method="post" commandName="user" role="form">
        <div class="form-group">
            <label for="username"></label>
        </div>
    </form:form>
</div>
</body>
</html>
