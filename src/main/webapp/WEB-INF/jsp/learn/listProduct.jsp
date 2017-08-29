<%--
  Created by IntelliJ IDEA.
  User: guoyc5
  Date: 2017/8/28
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<html>
<head>
    <title>ProductList</title>
</head>
<body>
<table align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>name</td>
                    <td>price</td>
        </tr>
        <c:forEach items="${cs}" var="c" varStatus="st">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                            <td>${c.price}</td>
                   
            </tr>
        </c:forEach>
</table>
</body>
</html>
