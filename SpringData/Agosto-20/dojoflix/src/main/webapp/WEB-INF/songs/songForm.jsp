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
                    <form:form action="/songs/new" method="post" modelAttribute="song">
                        <div>
                            <form:label path="name">Nombre</form:label>
                            <form:input path="name" />
                            <form:errors path="name"/>
                        </div>
                        <div>
                            <button type="submit">CREATE</button>
                        </div>
                    </form:form>
                </main>

            </body>

            </html>