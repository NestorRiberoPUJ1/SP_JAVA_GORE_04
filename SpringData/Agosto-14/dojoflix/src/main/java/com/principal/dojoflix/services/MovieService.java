package com.principal.dojoflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.principal.dojoflix.Repositories.MovieRepository;
import com.principal.dojoflix.models.Movie;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MovieService {
    
    @Autowired
    private MovieRepository movieRepository;


    // Método que permite buscar todas las peliculas
    public List<Movie> findAll() {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return movieRepository.findAll();
    }

    // Método que permite buscar una pelicula por su id
    public Movie findById(Long id) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return movieRepository.findById(id).orElse(null);
    }





}
