package me.melnek.EventHub.repositories;

import me.melnek.EventHub.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    //Buscar usuário através do Username
    Optional<Users> findByUsername(String username);

    //Buscar usuário através do Email
    Optional<Users> findByEmail(String email);
}
