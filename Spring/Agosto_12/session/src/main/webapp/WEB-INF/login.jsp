<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <form action="/login" method="post">
                <input type="text" name="username" id="username" placeholder="Username" value="${givenUsername}">
                <c:if test="${not empty errorUsername}">
                    <p>${errorUsername}</p>
                </c:if>
                <br>
                <input type="password" name="password" id="password" placeholder="Password">
                <c:if test="${not empty errorPassword}">
                    <p>${errorPassword}</p>
                </c:if>
                <br>
                <input type="checkbox" name="remember" id="remember">
                <label for="remember">Remember me</label>
                <br>
                <input type="submit" value="Login">
            </form>
        </body>

        </html>