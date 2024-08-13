package com.principal.data1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.principal.data1.models.Movie;
import com.principal.data1.repositories.MovieRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class MovieServices {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(String title) {
        if (title != null) {
            return movieRepository.findByTitleLike(title); // Busca un registro por título parecido en la tabla movies
        }
        return movieRepository.findAll(); // Busca todos los registros de la tabla movies
    }

    public Movie findMovieById(Long id) {
        return movieRepository.findById(id).orElse(null); // Busca un registro por id en la tabla movies y si no lo
                                                          // encuentra regresa null
    }

    public List<Movie> findMovieByTitle(String title) {
        return movieRepository.findByTitleLike(title); // Busca un registro por título parecido en la tabla movies
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie); // Guarda un registro en la tabla movies
    }

    public Movie updateMovie(Movie movie) {
        // Utiliza el mismo método save para actualizar un registro en la tabla movies
        // ya que el id ya existe
        return movieRepository.save(movie); // Actualiza un registro en la tabla movies
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id); // Elimina un registro por id en la tabla movies
    }
}
