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
                <c:import url="../common/navBar.jsp" />
                <main>
                    <form:form action="/login" method="post" modelAttribute="login">
                        <div>
                            <form:label path="email">E-mail</form:label>
                            <form:input path="email" />
                            <form:errors path="email" />
                        </div>
                        <div>
                            <form:label path="password">Password</form:label>
                            <form:input path="password" />
                            <form:errors path="password" />
                        </div>
                        <div>
                            <button type="submit">LOGIN</button>
                        </div>
                    </form:form>
                </main>

            </body>

            </html>