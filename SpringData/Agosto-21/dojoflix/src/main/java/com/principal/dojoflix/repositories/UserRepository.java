package com.principal.dojoflix.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.principal.dojoflix.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    // Método que permite buscar todos los usuarios
    List<User> findAll();  // Select * from users

    // Método que permite buscar un usuario por su id
    Optional<User> findById(Long id); // Select * from users where id = ?

    // Método que permite guardar un usuario
    // Método que permite actualizar un usuario
    User save(User user); // Insert into users values (?,?,?,?,?)

    // Método que permite eliminar un usuario
    void deleteById(Long id); // Delete from users where id = ?

    // Método que permite buscar un usuario por su email
    Optional<User> findByEmail(String email); // Select * from users where email = ?

    // Método que busca si un usuario existe por email
    boolean existsByEmail(String email); // Select count(*) from users where email = ?

}
