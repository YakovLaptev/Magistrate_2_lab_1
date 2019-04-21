package com.yakovlaptev.service;

import com.yakovlaptev.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.yakovlaptev.repository.UserRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class UserServiceImpl implements Service<User> {

    @Autowired
    private UserRepository repository;

    public List<User> getAll() {
        return repository.findAll();
    }

    public User getByID(long id) {
        return repository.findOne(id);
    }

    public User save(User entity) {
        return repository.saveAndFlush(entity);
    }

    public void remove(long id) {
        repository.delete(id);
    }

}
