package com.principal.repaso.services;

import java.util.List;

import javax.naming.Binding;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.principal.repaso.models.User;
import com.principal.repaso.respositories.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService extends BaseService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(Object object) {
        return userRepository.save((User) object);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(Object object) {
        return userRepository.save((User) object);
    }

    public BindingResult validateUser(User user, BindingResult result) {
        User userExists = userRepository.findByEmail(user.getEmail());
        if (userExists != null) {
            result.rejectValue("email", "errorEmail", "Este email ya está registrado");
        } else if (!user.getPasswordForm().equals(user.getPasswordConfirm())) {
            result.rejectValue("passwordConfirm", "errorConfirm", "Las contraseñas no coinciden");
        } else {
            //Encriptamos la contraseña si todo está bien.
            String hashedPassword= BCrypt.hashpw(user.getPasswordForm(), BCrypt.gensalt());
            user.setPassword(hashedPassword);          
        }

        return result;
    }

}
