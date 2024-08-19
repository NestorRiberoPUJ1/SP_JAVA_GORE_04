<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" href="http://localhost:8080/css/base.css">
            <link rel="stylesheet" href="http://localhost:8080/css/movie.css">
        </head>

        <body>
            <nav>
                <h1>DOJOFLIX</h1>
                <div>
                    <a href="login">Login</a>
                    <a href="register">Register</a>
                </div>
            </nav>
            <main>
                <c:choose>
                    <c:when test="${empty movie}">
                        <h3>Movie not found</h3>
                    </c:when>
                    <c:otherwise>
                        <h3>${movie.title}</h3>
                        <img src="${movie.poster}" alt="noimage" height="240px" width="120px">
                        <p>${movie.synopsis}</p>
                    </c:otherwise>
                </c:choose>
            </main>
        </body>

        </html>