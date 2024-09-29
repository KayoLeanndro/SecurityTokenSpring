package com.greenbean.autorization.services;

import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.greenbean.autorization.entities.User;
import com.greenbean.autorization.interfaces.IUser;
import com.greenbean.autorization.repositorys.UserRepository;

@Service
public class UserService implements IUser{
    
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
       
        User existUser = userRepository.findByUserName(user.getUsername());
        if(existUser != null){
            throw new Error("User already exists!");
        }
        user.setPassword(passwordEnconder().encode(user.getPassword()));

        User createUser = userRepository.save(user);
        return createUser;
    }

    public PasswordEncoder passwordEnconder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    public User updateUser(Integer id, User user) {
        
        
    }
    

    

}
