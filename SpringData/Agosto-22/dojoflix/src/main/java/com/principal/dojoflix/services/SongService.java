package com.principal.dojoflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.principal.dojoflix.models.Song;
import com.principal.dojoflix.repositories.SongRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;
    
    // Método que permite buscar todas los canciones
    public List<Song> findAll() {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return songRepository.findAll();
    }

    // Método que permite buscar un cancion por su id
    public Song findById(Long id) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return songRepository.findById(id).orElse(null);
    }

    // Método que permite guardar un cancion
    public Song save(Song cancion) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return songRepository.save(cancion);
    }

    // Método que permite actualizar un cancion
    public Song update(Song cancion) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return songRepository.save(cancion);
    }

    // Método que permite eliminar un cancion
    public void deleteById(Long id) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        songRepository.deleteById(id);
    }
    

}



