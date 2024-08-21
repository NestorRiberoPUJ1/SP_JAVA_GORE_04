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
                    <form:form action="/movies/new" method="post" modelAttribute="movie">
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
                            <form:label path="director">Director</form:label>
                            <form:select path="director">
                                <form:option value="${null}" disabled="true" selected="true"> Select a director</form:option>
                                <form:options items="${directors}" itemValue="id" itemLabel="name"/>  
                            </form:select>
                            <form:errors path="director"/>
                        </div>
                        <div>
                            <button type="submit">CREATE</button>
                        </div>
                    </form:form>
                </main>

            </body>

            </html>