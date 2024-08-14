package com.principal.dojoflix.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.principal.dojoflix.models.Movie;
import com.principal.dojoflix.services.MovieService;

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

}
