<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" href="http://localhost:8080/css/base.css">
            <link rel="stylesheet" href="http://localhost:8080/css/user.css">
        </head>

        <body>
            <c:import url="../common/navBar.jsp" />
            <main>
                <div class="mainHeader">
                    <h3>All Users</h3>
                    <a href="/users/new" class="iconBtn">
                        <img src="http://localhost:8080/assets/icons/add.svg" alt="">
                    </a>
                </div>
                <div class="userContainer">
                    <c:forEach var="user" items="${users}">
                        <div class="userCard">
                            <h4>${user.email}</h4>
                            <div class="userCardActions">
                                <a href="/users/${user.id}">Ver</a>
                                <a href="/users/edit/${user.id}">Editar</a>

                                <form action="/users/${user.id}" method="POST">
                                    <input type="hidden" name="_method" value="DELETE">
                                    <button type="submit">Eliminar</button>
                                </form>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </main>
        </body>

        </html>