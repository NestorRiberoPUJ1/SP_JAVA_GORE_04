package com.principal.metodos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    

    /* DASHBOARD */
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard.jsp";
    }

}
