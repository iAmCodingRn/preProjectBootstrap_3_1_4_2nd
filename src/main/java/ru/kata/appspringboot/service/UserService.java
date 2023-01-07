package ru.kata.appspringboot.service;

import ru.kata.appspringboot.entity.User;

public interface UserService {
    void save(User user);

    void update(User user);
}
