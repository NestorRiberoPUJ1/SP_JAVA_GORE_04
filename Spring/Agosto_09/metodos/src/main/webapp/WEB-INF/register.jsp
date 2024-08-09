<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" href="http://localhost:8080/css/style.css">
            <script src="http://localhost:8080/js/script.js"></script>
        </head>

        <body>
            <nav>
                <h1>Formulario de registro</h1>
                <img src="http://localhost:8080/assets/icons/register.svg" alt="img">
            </nav>

            <form action="/register" method="post" class="form-group">
                <div class="form-control">
                    <label for="nombre">Nombre</label>
                    <input type="text" name="nombre" id="nombre" required>
                </div>
                <div class="form-control">
                    <label for="apellidos">Apellidos</label>
                    <input type="text" name="apellidos" id="apellidos" required>
                </div>
                <div class="form-control">
                    <label for="email">Email</label>
                    <input type="email" name="email" id="email" required>
                </div>
                <div class="form-control">
                    <label for="password">Contraseña</label>
                    <input type="password" name="password" id="password" required>
                </div>
                <div class="form-control">
                    <label for="passwordConfirm">Repite la contraseña</label>
                    <input type="password" name="passwordConfirm" id="passwordConfirm" required>
                </div>
                <button type="submit">ENVIAR</button>
            </form>

        </body>

        </html>