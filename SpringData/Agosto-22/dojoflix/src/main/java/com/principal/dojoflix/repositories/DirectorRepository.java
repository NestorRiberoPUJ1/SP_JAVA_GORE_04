package com.principal.dojoflix.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.principal.dojoflix.models.Director;

@Repository
public interface DirectorRepository extends CrudRepository<Director, Long> {

    // Método que permite buscar todas los directores
    List<Director> findAll();  // Select * from directors
    
    // Método que permite buscar un director por su id
    Optional<Director> findById(Long id); // Select * from directors where id = ?

    // Método que permite guardar un director
    // Método que permite actualizar un director
    Director save(Director director); // Insert into directors values (?,?,?,?,?,?,?,?)

    // Método que permite eliminar un director
    void deleteById(Long id); // Delete from directors where id = ?

}