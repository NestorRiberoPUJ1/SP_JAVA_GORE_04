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
                <link rel="stylesheet" href="http://localhost:8080/css/courses.css">
            </head>

            <body>
                <main>
                    <h1>${course.name} </h1>
                    <h3>Instructor : ${course.instructor}</h3>
                    <div class="filterRow">
                        <h3>
                           Sign Ups: ${course.users.size()}
                        </h3>
                        <div>
                            <a href="">Low Sign Up</a>
                            <a href="">High Sign Up</a>
                        </div>
                    </div>
                    <table>
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Sign Up Date</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${course.users}" var="user">
                                <tr>
                                    <td> ${user.name}</td>
                                    <td>FECHA</td>
                                    <td>remove</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <div>
                        <a href="/courses/${course.id}/edit">
                            <button>Edit</button>
                        </a>
                        <button>Delete</button>
                    </div>
                </main>
            </body>

            </html>