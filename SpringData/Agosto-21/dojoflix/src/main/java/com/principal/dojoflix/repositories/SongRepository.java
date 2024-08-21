package com.principal.dojoflix.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.principal.dojoflix.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {

    // Método que permite buscar todas las canciones
    List<Song> findAll();  // Select * from songs
    
    // Método que permite buscar una canción por su id
    Optional<Song> findById(Long id); // Select * from songs where id = ?

    // Método que permite guardar una canción
    // Método que permite actualizar una canción
    Song save(Song song); // Insert into songs values (?,?,?,?,?)

    // Método que permite eliminar una canción
    void deleteById(Long id); // Delete from songs where id = ?
}
