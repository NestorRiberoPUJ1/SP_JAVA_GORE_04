package com.principal.vistas.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "Amaru Burdiles");
        model.addAttribute("edad", 21);
        model.addAttribute("animal", "lagartija");
        ArrayList<String> licores = new ArrayList<String>();
        licores.add("Pisco");
        licores.add("Vodka");
        licores.add("Ron");
        licores.add("Tequila");
        licores.add("Whisky");
        licores.add("Cerveza");
        licores.add("Vino");
        licores.add("Chicha");

        model.addAttribute("licores", licores);
        return "index.jsp";
    }

    @GetMapping("/login")
    public String login() {
        return "login.jsp";
    }

}
