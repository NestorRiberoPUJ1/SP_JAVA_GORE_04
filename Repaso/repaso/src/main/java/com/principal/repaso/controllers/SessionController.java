package com.principal.repaso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.principal.repaso.models.forms.Session;
import com.principal.repaso.services.SessionService;

import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @PostMapping("")
    public String login(@ModelAttribute Session session, BindingResult result, HttpSession currentSession) {
        // Llamar al método login del servicio de sesión
        result = sessionService.validateLogin(session.getEmail(), session.getPassword(), currentSession, result);

        if(result.hasErrors()) {
            return "redirect:/";
        }

        return "redirect:/";
    }

}
