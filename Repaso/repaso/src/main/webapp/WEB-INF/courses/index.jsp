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
                    <h1>Welcome, ${currentUser.name} </h1>
                    <div class="filterRow">
                        <h3>
                            Courses
                        </h3>
                        <div>
                            <a href="">Low Sign Up</a>
                            <a href="">High Sign Up</a>
                        </div>
                    </div>
                    <table>
                        <thead>
                            <tr>
                                <th>Course</th>
                                <th>Instructor</th>
                                <th>Signups</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${courses}" var="course">
                                <tr>
                                    <td> <a href="/courses/${course.id}">${course.name}</a> </td>
                                    <td>${course.instructor}</td>
                                    <td>${course.users.size()} / ${course.capacity}</td>
                                    <td>
                                        Add
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <a href="/courses/new">
                        <button>Add a Course</button>
                    </a>
                </main>
            </body>

            </html>