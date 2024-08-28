package com.principal.repaso.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.principal.repaso.models.User;
import com.principal.repaso.respositories.UserRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class SessionService {

    @Autowired
    private UserRepository userRepository;

    // Método para iniciar sesión
    public BindingResult validateLogin(String email, String password, HttpSession session, BindingResult result) {
        // Validar que el email y la contraseña sean correctos
        User user = userRepository.findByEmail(email);
        if (user == null) {
            result.rejectValue("email", "error", "Email no registrado");
        } else if (!BCrypt.checkpw(password, user.getPassword())) {
            result.rejectValue("password", "error", "Contraseña incorrecta");
        }else{
            session.setAttribute("currentUser", user);
        }

        return result;
    }

    // Método para cerrar sesión
    public void logout(HttpSession session) {
        session.invalidate();
    }

}
