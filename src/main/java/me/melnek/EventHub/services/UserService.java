package me.melnek.EventHub.services;

import me.melnek.EventHub.models.Users;
import me.melnek.EventHub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Injetar o passwordEncoder
    @Autowired
    private PasswordEncoder passwordEncoder;


    public Optional<Users> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Optional<Users> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Users saveUser(Users users) {
        if (userRepository.findByEmail(users.getEmail()).isPresent()) {
            throw new RuntimeException("Email já cadastrado por outro usuário.");
        }
        users.setPassword(passwordEncoder.encode(users.getPassword()));

        return userRepository.save(users);
    }

}
