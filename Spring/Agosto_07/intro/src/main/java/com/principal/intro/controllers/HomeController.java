package com.principal.intro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    @GetMapping("")
    public String root() {
        return "BIENVENIDOS AL DESARROLLO DE APLICACIONES WEB";
    }

    @GetMapping("/saludar")
    public String saludar() {
        return "HOLA A TODOS";
    }

    @PostMapping("/saludar")
    public String saludarPost() {
        return "HOLA A TODOS POR POST";
    }

    @PutMapping("/saludar")
    public String saludarPut() {
        return "HOLA A TODOS POR PUT";
    }

    @GetMapping("/despedir")
    public String despedir() {
        return "NOS VEMOS";
    }

    @GetMapping("/buscar")
    public String buscar(
            @RequestParam(value = "brand", required = false) String marca,
            @RequestParam(value = "model", required = false) String modelo) {
        return "BUSCANDO: " + marca + " " + modelo;
    }

    @GetMapping("/buscar/{brand}/{model}")
    public String buscarPath(
            @PathVariable(value = "brand") String marca,
            @PathVariable(value = "model") String modelo) {
        return "BUSCANDO: " + marca + " " + modelo;
    }

}
