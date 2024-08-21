package com.principal.dojoflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.principal.dojoflix.models.forms.Login;
import com.principal.dojoflix.services.forms.LoginService;

import jakarta.validation.Valid;

@Controller
public class SessionController {
    
    @Autowired
    private LoginService loginService;


    // Ruta que permite ver formulario para iniciar sesión
    @GetMapping("/login")
    public String login(@ModelAttribute("login") Login login) {
        // LÓGICA ADICIONAL
        return "login/login.jsp";
    }

    // Ruta que permite iniciar sesión
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("login") Login login, BindingResult result) {

        result = loginService.validateLogin(result, login);

        if (result.hasErrors()) {
            return "login/login.jsp";
        }
        return "redirect:/";
    }




}
