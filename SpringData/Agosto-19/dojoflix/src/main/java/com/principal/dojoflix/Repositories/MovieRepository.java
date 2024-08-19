package com.principal.dojoflix.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.principal.dojoflix.models.Movie;
import com.principal.dojoflix.models.Playlist;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    // Método que permite buscar todas las peliculas
    List<Movie> findAll();  // Select * from movies
    
    //Método para buscar todas las peliculas sin playlist	
    List<Movie> findByPlaylist(Playlist playlist);


    // Método que permite buscar una pelicula por su id
    Optional<Movie> findById(Long id); // Select * from movies where id = ?

    // Método que permite guardar una pelicula
    // Método que permite actualizar una pelicula
    Movie save(Movie movie); // Insert into movies values (?,?,?,?,?,?,?,?)

    // Método que permite eliminar una pelicula
    void deleteById(Long id); // Delete from movies where id = ?


}
