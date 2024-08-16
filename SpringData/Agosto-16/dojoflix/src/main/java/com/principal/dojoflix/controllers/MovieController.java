package com.principal.dojoflix.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.principal.dojoflix.models.Movie;
import com.principal.dojoflix.services.MovieService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class MovieController {

    MovieService movieService;

    @GetMapping("/movies")
    public String movies(Model model) {
        List<Movie> movies = movieService.findAll(); // Servicio que permite buscar todas las peliculas
        model.addAttribute("movies", movies); // Agrega la lista de peliculas al modelo
        System.out.println(movies);

        return "movies.jsp";
    }

    @GetMapping("/movies/{id}")
    public String movie(Model model, @PathVariable("id") Long id) {
        Movie movie = movieService.findById(id); // Servicio que permite buscar una pelicula por su id
        model.addAttribute("movie", movie); // Agrega la pelicula al modelo
        return "movie.jsp";
    }

    @GetMapping("/movies/new")
    public String newMovie(@ModelAttribute("movie") Movie movie) {
        return "movieForm.jsp";
    }

    @PostMapping("/movies/new")
    public String saveMovie(@Valid @ModelAttribute("movie") Movie movie, BindingResult result) {
        if (result.hasErrors()) {
            return "movieForm.jsp"; // Si hay errores, regresa al formulario
        }
        // Si no hay errores, guarda la pelicula
        movieService.save(movie); // Servicio que permite guardar una pelicula

        return "redirect:/movies";
    }


    @GetMapping("/movies/edit/{id}")
    public String editMovie(Model model, @PathVariable("id") Long id) {
        Movie movie = movieService.findById(id); // Servicio que permite buscar una pelicula por su id
        model.addAttribute("movie", movie); // Agrega la pelicula al modelo
        return "movieFormEdit.jsp";
    }

    @PutMapping("/movies/edit/{id}")
    public String updateMovie(@Valid @ModelAttribute("movie") Movie movie, BindingResult result) {
        if (result.hasErrors()) {
            return "movieFormEdit.jsp"; // Si hay errores, regresa al formulario
        }
        // Si no hay errores, actualiza la pelicula
        movieService.update(movie); // Servicio que permite guardar una pelicula

        return "redirect:/movies";
    }

}
