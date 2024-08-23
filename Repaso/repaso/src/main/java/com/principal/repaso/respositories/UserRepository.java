package com.principal.repaso.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.principal.repaso.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


    //Método para buscar todos los usuarios
    List<User> findAll();

    //Método para buscar un usuario por id
    <Optinal>User findById(long id);

    //Método para buscar un usuario por email
    <Optional>User findByEmail(String email);

    //Método para crear un usuario
    //Método para actualizar un usuario
    User save(User user);

    
    //Método para eliminar un usuario
    void deleteById(Long id);

}
