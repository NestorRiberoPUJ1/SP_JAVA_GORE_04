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
                        <h1>Create a new course</h1>
                        <form:form action="/courses/new" method="POST" modelAttribute="course">
                            <div>
                                <form:label path="name">Name:</form:label>
                                <form:input path="name" type="text" />
                                <form:errors path="name" />
                            </div>
                            <div>
                                <form:label path="instructor">Instructor:</form:label>
                                <form:input path="instructor" type="text" />
                                <form:errors path="instructor" />
                            </div>
                            <div>
                                <form:label path="capacity">Capacity:</form:label>
                                <form:input path="capacity" type="number" />
                                <form:errors path="capacity" />
                            </div>

                            <button type="submit">Create</button>
                        </form:form>
                    </section>
                    <section>

                    </section>
                </main>
            </body>

            </html>