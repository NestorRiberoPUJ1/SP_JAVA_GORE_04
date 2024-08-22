package com.principal.dojoflix.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.principal.dojoflix.models.Playlist;

@Repository
public interface PlaylistRepository  extends CrudRepository<Playlist, Long> {
    
    //Método para crear una playlist
    //Método para actualizar una playlist
    public Playlist save(Playlist playlist);

    //Método para buscar una playlist por id
    public Optional<Playlist> findById(Long id);

    //Método para buscar todas las playlists
    public List<Playlist> findAll();

    //Método para eliminar una playlist por id
    public void deleteById(Long id);


}
