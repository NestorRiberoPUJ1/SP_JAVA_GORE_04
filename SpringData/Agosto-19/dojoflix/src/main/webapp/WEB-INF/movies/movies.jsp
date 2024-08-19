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
                <div class="mainHeader">
                    <h3>All Movies</h3>
                    <a href="/movies/new" class="iconBtn">
                        <img src="http://localhost:8080/assets/icons/add.svg" alt="">
                    </a>
                </div>
                <div class="movieContainer">
                    <c:forEach var="movie" items="${movies}">
                        <div class="movieCard">
                            <img src="${movie.poster}" alt="noimage">
                            <h4>${movie.title}</h4>
                            <p>Directed By: ${movie.director.name}</p>
                            <p>${movie.duration} min</p>
                            <p>${movie.synopsis}</p>
                            <p>Playlist: ${movie.playlist.songs}</p>
                            <div>
                                <a href="/movies/${movie.id}">Ver</a>
                                <a href="/movies/edit/${movie.id}">Editar</a>
                                
                                <form action="/movies/${movie.id}" method="POST">
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