package com.principal.dojoflix.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(HttpSession session, Model model) {

        if( session.getAttribute("user")==null){
            return "redirect:/login";
        }

        return "home.jsp";
    }

}
