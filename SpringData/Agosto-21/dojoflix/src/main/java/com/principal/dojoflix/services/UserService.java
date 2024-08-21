package com.principal.dojoflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.principal.dojoflix.models.User;
import com.principal.dojoflix.repositories.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Método que permite buscar todos los usuarios
    public List<User> findAll() {
        // LÓGICA ADICIONAL
        return userRepository.findAll();
    }

    // Método que permite buscar un usuario por su id
    public User findById(Long id) {
        // LÓGICA ADICIONAL
        return userRepository.findById(id).orElse(null);
    }

    // Método que permite guardar un usuario
    public User save(User user) {
        // LÓGICA ADICIONAL
        return userRepository.save(user);
    }

    // Método que permite actualizar un usuario
    public User update(User user) {
        // LÓGICA ADICIONAL
        return userRepository.save(user);
    }

    // Método que permite eliminar un usuario
    public void deleteById(Long id) {
        // LÓGICA ADICIONAL
        userRepository.deleteById(id);
    }

    /* VALIDACIONES */

    public BindingResult validateNewUser(BindingResult result, User user) {
        // Validar contraseñas
        if (!user.getPassword().equals(user.getPasswordConfirmation())) {
            result.rejectValue("passwordConfirmation", "errorPasswordMissmatch", "Las contraseñas no coinciden");
        }
        // Validar email único
        if (userRepository.existsByEmail(user.getEmail())) {
            result.rejectValue("email", "errorEmail", "El email ya está registrado");
        }

        return result;
    }

}
