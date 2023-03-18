package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    User getUserById(Long id);
    void createUser(User user);
    void deleteUserById(Long id);
    User findByUsername(String username);
    void editUser(User user);
}
