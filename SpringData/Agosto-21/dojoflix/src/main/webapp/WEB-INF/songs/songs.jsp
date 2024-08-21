<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" href="http://localhost:8080/css/base.css">
            <link rel="stylesheet" href="http://localhost:8080/css/song.css">
        </head>

        <body>
            <c:import url="../common/navBar.jsp" />
            <main>
                <div class="mainHeader">
                    <h3>All Songs</h3>
                    <a href="/songs/new" class="iconBtn">
                        <img src="http://localhost:8080/assets/icons/add.svg" alt="">
                    </a>
                </div>
                <div class="songContainer">
                    <c:forEach var="song" items="${songs}">
                        <div class="songCard">
                            <h4>${song.name}</h4>
                            <div class="songCardActions">
                                <a href="/songs/${song.id}">Ver</a>
                                <a href="/songs/edit/${song.id}">Editar</a>
                                
                                <form action="/songs/${song.id}" method="POST">
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