package com.principal.dojoflix.controllers;

import java.util.List;

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

import com.principal.dojoflix.models.Director;
import com.principal.dojoflix.models.Movie;
import com.principal.dojoflix.services.DirectorService;
import com.principal.dojoflix.services.MovieService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/movies")
public class MovieController {

    MovieService movieService;
    DirectorService directorService;

    @GetMapping("")
    public String movies(Model model) {
        List<Movie> movies = movieService.findAll(); // Servicio que permite buscar todas las peliculas
        model.addAttribute("movies", movies); // Agrega la lista de peliculas al modelo
        return "movies/movies.jsp";
    }

    @GetMapping("/{id}")
    public String movie(Model model, @PathVariable("id") Long id) {
        Movie movie = movieService.findById(id); // Servicio que permite buscar una pelicula por su id
        model.addAttribute("movie", movie); // Agrega la pelicula al modelo
        return "movies/movie.jsp";
    }

    @GetMapping("/new")
    public String newMovie(@ModelAttribute("movie") Movie movie, Model model) {

        List<Director> directors = directorService.findAll(); // Servicio que permite buscar todos los directores
        model.addAttribute("directors", directors);
        return "movies/movieForm.jsp";
    }

    @PostMapping("/new")
    public String saveMovie(@Valid @ModelAttribute("movie") Movie movie, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Director> directors = directorService.findAll(); // Servicio que permite buscar todos los directores
            model.addAttribute("directors", directors);
            return "movies/movieForm.jsp"; // Si hay errores, regresa al formulario
        }
        // Si no hay errores, guarda la pelicula
        movieService.save(movie); // Servicio que permite guardar una pelicula

        return "redirect:/movies";
    }

    @GetMapping("/edit/{id}")
    public String editMovie(Model model, @PathVariable("id") Long id) {
        Movie movie = movieService.findById(id); // Servicio que permite buscar una pelicula por su id
        List<Director> directors = directorService.findAll(); // Servicio que permite buscar todos los directores
        model.addAttribute("directors", directors);
        model.addAttribute("movie", movie); // Agrega la pelicula al modelo
        return "movies/movieFormEdit.jsp";
    }

    @PutMapping("/edit/{id}")
    public String updateMovie(@Valid @ModelAttribute("movie") Movie movie, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Director> directors = directorService.findAll(); // Servicio que permite buscar todos los directores
            model.addAttribute("directors", directors);
            return "movies/movieFormEdit.jsp"; // Si hay errores, regresa al formulario
        }
        // Si no hay errores, actualiza la pelicula
        movieService.update(movie); // Servicio que permite guardar una pelicula

        return "redirect:/movies";
    }

    @DeleteMapping("/{id}")
    public String deleteMovie(@PathVariable("id") Long id) {
        movieService.deleteById(id); // Servicio que permite eliminar una pelicula
        return "redirect:/movies";
    }

}
