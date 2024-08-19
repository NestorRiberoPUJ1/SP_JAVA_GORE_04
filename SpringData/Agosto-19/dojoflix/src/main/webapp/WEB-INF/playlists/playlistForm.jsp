<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
                <link rel="stylesheet" href="http://localhost:8080/css/base.css">
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
                    <form:form action="/playlists/new" method="post" modelAttribute="playlist">
                        <div>
                            <form:label path="songs">Songs</form:label>
                            <form:input path="songs" />
                            <form:errors path="songs" />
                        </div>
                        <div>
                            <form:select path="movie">
                                <form:options items="${movies}" itemValue="id" itemLabel="title"/>  
                            </form:select>
                        </div>
                        <div>
                            <button type="submit">CREATE</button>
                        </div>
                    </form:form>
                </main>

            </body>

            </html>