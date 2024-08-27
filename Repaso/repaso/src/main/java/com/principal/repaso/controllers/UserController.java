package com.principal.repaso.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.principal.repaso.models.User;
import com.principal.repaso.services.UserService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Método para mostrar la vista de usuarios
    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users/index.jsp";
    }

    // Método para mostrar la vista de usuario por id
    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "users/show.jsp";
    }

    // Método para mostrar la vista de crear usuario
    @GetMapping("/new")
    public String create(@ModelAttribute("user") User user) {
        return "users/create.jsp";
    }

    // Método para guardar un usuario
    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "users/create.jsp";
        }
        return "redirect:/users";
    }

    // Método para mostrar la vista de editar usuario
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "users/edit.jsp";
    }

    // Método para actualizar un usuario
    @PutMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "users/edit.jsp";
        }
        return "redirect:/users";
    }

    // Método para eliminar un usuario
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/users";
    }

}
