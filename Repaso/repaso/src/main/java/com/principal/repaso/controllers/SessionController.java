package com.principal.repaso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.principal.repaso.models.User;
import com.principal.repaso.models.forms.Session;
import com.principal.repaso.services.SessionService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @PostMapping("")
    public String login(@Valid @ModelAttribute Session session, BindingResult result, HttpSession currentSession,
            Model model) {
        //VALIDACION DE ERRORES POR ANOTADORES
        if (result.hasErrors()) {
            model.addAttribute("user", new User());
            return "home/index.jsp";
        }

        //VALIDACION DE ERRORES POR METODOS
        result = sessionService.validateLogin(session.getEmail(), session.getPassword(), currentSession, result);
        if (result.hasErrors()) {
            model.addAttribute("user", new User());
            return "home/index.jsp";
        }

        return "redirect:/courses";
    }

}
