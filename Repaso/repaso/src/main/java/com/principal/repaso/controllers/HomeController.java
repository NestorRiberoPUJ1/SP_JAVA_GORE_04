package com.principal.repaso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.principal.repaso.models.User;
import com.principal.repaso.models.forms.Session;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("session", new Session());
        return "home/index.jsp";
    }

}
