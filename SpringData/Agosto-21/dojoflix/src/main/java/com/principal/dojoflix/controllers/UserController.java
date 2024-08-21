package com.principal.dojoflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.principal.dojoflix.models.User;
import com.principal.dojoflix.services.UserService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Ruta que permite buscar todos los usuarios
    @GetMapping("")
    public String findAll() {
        // LÓGICA ADICIONAL
        return "users/index.jsp";
    }

    // Ruta que permite buscar un usuario por su id
    @GetMapping("/{id}")
    public String findById(Long id) {
        // LÓGICA ADICIONAL
        return "users/show.jsp";
    }

    // Ruta que permite ver formulario para crear un usuario
    @GetMapping("/new")
    public String create(@ModelAttribute("user") User user) {
        // LÓGICA ADICIONAL
        return "users/new.jsp";
    }

    // Ruta que permite guardar un usuario
    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult result) {

        result = userService.validateNewUser(result, user);

        if (result.hasErrors()) {
            return "users/new.jsp";
        }
        userService.save(user);
        return "redirect:/users";
    }

    // Ruta que permite ver formulario para editar un usuario
    @GetMapping("/edit/{id}")
    public String edit(Long id) {
        // LÓGICA ADICIONAL
        return "users/edit.jsp";
    }

    // Ruta que permite actualizar un usuario
    @PutMapping("/edit/{id}")
    public String update() {
        // LÓGICA ADICIONAL
        return "redirect:/users";
    }

    // Ruta que permite eliminar un usuario
    @DeleteMapping("/{id}")
    public String delete(Long id) {
        // LÓGICA ADICIONAL
        return "redirect:/users";
    }

}
