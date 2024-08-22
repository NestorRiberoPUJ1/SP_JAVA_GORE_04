package com.principal.dojoflix.services.forms;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.principal.dojoflix.models.User;
import com.principal.dojoflix.models.forms.Login;
import com.principal.dojoflix.repositories.UserRepository;

import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public BindingResult validateLogin(BindingResult result, Login login, HttpSession session) {
        // VALIDACIONES PARA LOGIN
        User foundUser = userRepository.findByEmail(login.getEmail()).orElse(null);

        if (foundUser == null) { // Si no existe usuario con ese email
            result.rejectValue("email", "errorEmail", "El email no está registrado");
        } else if ( !BCrypt.checkpw(login.getPassword(), foundUser.getPassword())) { // Si la contraseña no coincide
            result.rejectValue("password", "errorPassword", "La contraseña es incorrecta");
        }
        session.setAttribute("user", foundUser);
        return result;
    }

}
