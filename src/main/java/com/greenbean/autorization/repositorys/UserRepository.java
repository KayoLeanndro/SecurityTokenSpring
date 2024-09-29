package com.greenbean.autorization.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenbean.autorization.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String username);
}
