package com.principal.repaso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public User save(Object object) {
        return userRepository.save((User) object);
    }

    @Override
    public User update(Object object) {
        return userRepository.save((User) object);
    }

}
