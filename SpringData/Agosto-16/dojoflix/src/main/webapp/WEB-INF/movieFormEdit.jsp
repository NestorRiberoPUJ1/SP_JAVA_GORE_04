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
                    <form:form action="/movies/edit/${movie.id}" method="post" modelAttribute="movie">
                        <input type="hidden" name="_method" value="PUT"/>
                        <div>
                            <form:label path="title">Title</form:label>
                            <form:input path="title" />
                            <form:errors path="title"/>
                        </div>
                        <div>
                            <form:label path="synopsis">Synopsis</form:label>
                            <form:input path="synopsis" />
                            <form:errors path="synopsis"/>
                        </div>
                        <div>
                            <form:label path="poster">Poster</form:label>
                            <form:input path="poster" />
                            <form:errors path="poster"/>
                        </div>
                        <div>
                            <form:label path="duration">Duration</form:label>
                            <form:input path="duration" />
                            <form:errors path="duration"/>
                        </div>
                        <div>
                            <form:label path="gender">Gender</form:label>
                            <form:input path="gender" />
                            <form:errors path="gender"/>
                        </div>
                        <div>
                            <button type="submit">UPDATE</button>
                        </div>
                    </form:form>
                </main>

            </body>

            </html>