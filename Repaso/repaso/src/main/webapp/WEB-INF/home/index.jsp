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
                <link rel="stylesheet" href="http://localhost:8080/css/home.css">
            </head>

            <body>

                <main>
                    <section>
                        <h1>Register</h1>
                        <form:form action="/users/new" method="POST" modelAttribute="user">
                            <div>
                                <form:label path="name">Name:</form:label>
                                <form:input path="name" type="text" />
                                <form:errors path="name" />
                            </div>
                            <div>
                                <form:label path="email">Email:</form:label>
                                <form:input path="email" type="text" />
                                <form:errors path="email" />
                            </div>
                            <div>
                                <form:label path="passwordForm">Password:</form:label>
                                <form:input path="passwordForm" type="text" />
                                <form:errors path="passwordForm" />
                            </div>
                            <div>
                                <form:label path="passwordConfirm">Password Confirm:</form:label>
                                <form:input path="passwordConfirm" type="text" />
                                <form:errors path="passwordConfirm" />
                            </div>
                            <button type="submit">Register</button>
                        </form:form>
                    </section>
                    <section>
                        <h1>Login</h1>
                        <form:form action="/session" method="POST" modelAttribute="session">
                            <div>
                                <form:label path="email">Email:</form:label>
                                <form:input path="email" type="text" />
                                <form:errors path="email" />
                            </div>
                            <div>
                                <form:label path="password">Password:</form:label>
                                <form:input path="password" type="text" />
                                <form:errors path="password" />
                            </div>
                            <button type="submit">Login</button>
                        </form:form>
                    </section>
                </main>
            </body>

            </html>