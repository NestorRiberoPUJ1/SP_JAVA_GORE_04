package com.principal.data1.controllers;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.principal.data1.models.Movie;
import com.principal.data1.services.MovieServices;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private MovieServices movieServices;

    @PostMapping("")
    public Movie saveMovie(
            @RequestParam("title") String title,
            @RequestParam("director") String director,
            @RequestParam("duration") Integer duration,
            @RequestParam("classification") String classification,
            @RequestParam("language") String language) {
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setDirector(director);
        movie.setDuration(duration);
        movie.setClassification(classification);
        movie.setLanguage(language);
        return movieServices.saveMovie(movie);
    }

    @GetMapping("")
    public List<Movie> getAllMovies(
            @RequestParam(value = "title", required = false) String title) {
        System.out.println(title);
        return movieServices.getAllMovies(title);
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable("id") Long id) {
        return movieServices.findMovieById(id);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable("id") Long id,
            @RequestParam("title") String title,
            @RequestParam("director") String director,
            @RequestParam("duration") Integer duration,
            @RequestParam("classification") String classification,
            @RequestParam("language") String language,
            @RequestParam("releaseDate") String releaseDate) {
        Movie movie = movieServices.findMovieById(id);
        movie.setTitle(title);
        movie.setDirector(director);
        movie.setDuration(duration);
        movie.setClassification(classification);
        movie.setLanguage(language);
        movie.setReleaseDate(new Date(releaseDate));
        return movieServices.updateMovie(movie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable("id") Long id) {
        movieServices.deleteMovie(id);
        return;
    }

}
