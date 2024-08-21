package com.principal.dojoflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.principal.dojoflix.models.Playlist;
import com.principal.dojoflix.repositories.PlaylistRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlaylistService {
    
    @Autowired
    private PlaylistRepository playlistRepository;


    // Método que permite buscar todas las playlists
    public List<Playlist> findAll() {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return playlistRepository.findAll();
    }

    // Método que permite buscar una playlist por su id
    public Playlist findById(Long id) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return playlistRepository.findById(id).orElse(null);
    }

    // Método que permite guardar una playlist
    public Playlist save(Playlist playlist) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return playlistRepository.save(playlist);
    }

    // Método que permite actualizar una playlist
    public Playlist update(Playlist playlist) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return playlistRepository.save(playlist);
    }

    // Método que permite eliminar una playlist
    public void deleteById(Long id) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        playlistRepository.deleteById(id);
    }

}
