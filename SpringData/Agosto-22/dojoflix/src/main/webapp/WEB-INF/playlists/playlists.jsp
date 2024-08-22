<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" href="http://localhost:8080/css/base.css">
            <link rel="stylesheet" href="http://localhost:8080/css/playlist.css">
        </head>

        <body>
            <c:import url="../common/navBar.jsp" />
            <main>
                <div class="mainHeader">
                    <h3>All Playlists</h3>
                    <a href="/playlists/new" class="iconBtn">
                        <img src="http://localhost:8080/assets/icons/add.svg" alt="">
                    </a>
                </div>
                <div class="playlistContainer">
                    <c:forEach var="playlist" items="${playlists}">
                        <div class="playlistCard">
                            <img src="${playlist.movie.poster}" alt="noimage">
                            <h4>${playlist.movie.title}</h4>
                            <p>Songs</p>
                            <ul>
                                <c:forEach var="song" items="${playlist.songs}">
                                    <li>${song.name}</li>
                                </c:forEach>
                            </ul>
                            <div class="playlistCardActions">
                                <a href="/playlists/${playlist.id}">Ver</a>
                                <a href="/playlists/edit/${playlist.id}">Editar</a>

                                <form action="/playlists/${playlist.id}" method="POST">
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