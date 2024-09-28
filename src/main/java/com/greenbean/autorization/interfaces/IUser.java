package com.greenbean.autorization.interfaces;

import com.greenbean.autorization.entities.User;

public interface IUser {
    User createUser(User user);

    User updateUser(Integer id, User user);
}
