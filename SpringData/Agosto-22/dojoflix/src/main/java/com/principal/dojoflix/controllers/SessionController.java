package com.principal.dojoflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.principal.dojoflix.models.forms.Login;
import com.principal.dojoflix.services.forms.LoginService;

import jakarta.servlet.http.HttpSession;
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
    public String login(@Valid @ModelAttribute("login") Login login, BindingResult result, HttpSession session) {

        result = loginService.validateLogin(result, login, session);

        if (result.hasErrors()) {
            session.invalidate();
            return "login/login.jsp";
        }
        return "redirect:/";
    }

    @DeleteMapping("/session")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

}
