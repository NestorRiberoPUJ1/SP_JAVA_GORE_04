package com.principal.data1.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.principal.data1.models.Movie;

@Repository // Indica que es un repositorio
public interface MovieRepository extends CrudRepository<Movie, Long> {
    /* Se codifican todos los tipos de queries que se van a utilizar */

    List<Movie> findAll(); // SELECT * FROM movies

    List<Movie> findByTitle(String title); // SELECT * FROM movies WHERE title = ?

    List<Movie> findByTitleLike(String title); // SELECT * FROM movies WHERE title LIKE ?

    List<Movie> findByGender(String gender); // SELECT * FROM movies WHERE gender = ?

    List<Movie> findByStudio(String studio); // SELECT * FROM movies WHERE studio = ?

    List<Movie> findByReleaseDateBetween(Date start, Date end); // SELECT * FROM movies WHERE release_date BETWEEN ? AND
                                                                // ?
}
