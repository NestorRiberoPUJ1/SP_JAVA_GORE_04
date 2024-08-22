<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <link rel="stylesheet" href="http://localhost:8080/css/base.css">
        <nav>
            <h1><a href="/">DOJOFLIX</a></h1>
            <div>
                <a href="/movies">MOVIES</a>|
                <a href="/playlists">PLAYLISTS</a>|
                <a href="/songs">SONGS</a>

            </div>
            <c:choose>
                <c:when test="${user != null}">
                    <div>
                        <form action="/session" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <button type="submit">LOGOUT</button>
                        </form>
                    </div>
                </c:when>
                <c:otherwise>
                    <div>
                        <a href="/login">LOGIN</a>
                        <a href="/register">REGISTER</a>
                    </div>
                </c:otherwise>
            </c:choose>
        </nav>