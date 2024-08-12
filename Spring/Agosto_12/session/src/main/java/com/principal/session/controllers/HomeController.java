package com.principal.session.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "login.jsp";
    }

    @PostMapping("/login")
    public String loginPost(
            HttpSession session,
            RedirectAttributes flash,
            @RequestParam(value = "username", required = true) String username,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "remember", required = false) String remember) {
        System.out.println("username: " + username + " password: " + password + " remember: " + remember);

        /* VALIDACIONES */
        boolean hasError = false;
        if (username == null || username.isEmpty() || username.length() < 3) {
            flash.addFlashAttribute("errorUsername", "El username es requerido y debe tener al menos 3 caracteres");
            hasError = true;
        }
        if (password == null || password.isEmpty() || password.length() < 8) {
            flash.addFlashAttribute("errorPassword", "El password es requerido y debe tener al menos 8 caracteres");
            hasError = true;
        }

        if (hasError) {
            flash.addFlashAttribute("givenUsername", username);
            return "redirect:/login";
        }

        /* AGRGAR A LA SESSION EL USERNAME */
        session.setAttribute("username", username);

        return "redirect:/home";
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    @GetMapping("/home")
    public String home(Model model, HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null) {
            return "redirect:/login";
        }
        return "home.jsp";
    }

}
