<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" href="css/style.css">
            <script src="js/script.js" defer></script>
        </head>

        <body>
            <h1>MI PRIMER JSP</h1>
            <h2>By: ${username}</h2>
            <button>LIKE</button>

            <c:if test="${edad > 18}">
                <h2 onmouseover="handleMouseOver(this)" onmouseleave="handleMouseOut(this)">Puedes comprar Licores</h2>
                <ul>
                    <c:forEach var="licor" items="${licores}">
                        <li>${licor}</li>
                    </c:forEach>
                </ul>

            </c:if>

            <c:choose>
                <c:when test="${animal =='perro'}">
                    <img class="animalImg" src="https://i.pinimg.com/236x/26/24/9a/26249a78777f6e3527d959ed4399dc1e.jpg"
                        alt="perro">
                </c:when>
                <c:when test="${animal=='gato'}">
                    <img class="animalImg"
                        src="https://www.procat.com.ec/wp-content/uploads/2018/01/pro-cat-gatito-fondo-productos.png"
                        alt="gato">
                </c:when>
                <c:otherwise>
                    <img class="animalImg"
                        src="https://xavivallsvet.com/wp-content/uploads/2021/07/Caso-cli%CC%81nico-chinchilla-7-e1626910580261.jpg"
                        alt="chinchilla">
                </c:otherwise>

            </c:choose>

        </body>

        </html>