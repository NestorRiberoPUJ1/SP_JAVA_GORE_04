package com.principal.metodos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {

    /* RUTA DEL FORMULARIO */
    @GetMapping("/register")
    public String register() {
        return "register.jsp";
    }

    @PostMapping("/register")
    public String handleRegister(
            @RequestParam(value = "nombre", required = true) String nombre,
            @RequestParam(value = "apellidos", required = true) String apellidos,
            @RequestParam(value = "email", required = true) String email,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "passwordConfirm", required = true) String passwordConfirm) {
        /* PROCESO Y RETORNAR REDIRECCIÓN */
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("PasswordConfirm: " + passwordConfirm);
        
        /* LOGICA BÁSICA EN NUESTRO CONTROLADOR */
        if (password.equals(passwordConfirm)) {
            return "redirect:/dashboard";
        }
    
        return "redirect:/register";
    }

}
