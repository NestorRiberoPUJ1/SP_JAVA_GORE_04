package com.principal.dojoflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.principal.dojoflix.Repositories.DirectorRepository;
import com.principal.dojoflix.models.Director;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;
    
    // Método que permite buscar todas los directores
    public List<Director> findAll() {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return directorRepository.findAll();
    }

    // Método que permite buscar un director por su id
    public Director findById(Long id) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return directorRepository.findById(id).orElse(null);
    }

    // Método que permite guardar un director
    public Director save(Director director) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return directorRepository.save(director);
    }

    // Método que permite actualizar un director
    public Director update(Director director) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        return directorRepository.save(director);
    }

    // Método que permite eliminar un director
    public void deleteById(Long id) {
        // TODA LA LÓGICA ADICIONAL QUE SE REQUIERA
        directorRepository.deleteById(id);
    }
    

}



