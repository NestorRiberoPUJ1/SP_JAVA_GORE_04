package com.principal.dojoflix.services.forms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.principal.dojoflix.models.User;
import com.principal.dojoflix.models.forms.Login;
import com.principal.dojoflix.repositories.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public BindingResult validateLogin(BindingResult result, Login login) {
        // VALIDACIONES PARA LOGIN
        User foundUser = userRepository.findByEmail(login.getEmail()).orElse(null);

        if (foundUser == null) { // Si no existe usuario con ese email
            result.rejectValue("email", "errorEmail", "El email no está registrado");
        } else if (!foundUser.getPassword().equals(login.getPassword())) { // Si la contraseña no coincide
            result.rejectValue("password", "errorPassword", "La contraseña es incorrecta");
        }

        return result;
    }

}
