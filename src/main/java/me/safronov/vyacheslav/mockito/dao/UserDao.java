package me.safronov.vyacheslav.mockito.dao;

import me.safronov.vyacheslav.mockito.model.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> findAllUsers();
}
