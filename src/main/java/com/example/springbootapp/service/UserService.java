package com.example.springbootapp.service;


import com.example.springbootapp.models.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();
    public User findOne(int id);
    public void save(User user);
    public void update(int id, User updatedUser);
    public void delete(int id);
}
