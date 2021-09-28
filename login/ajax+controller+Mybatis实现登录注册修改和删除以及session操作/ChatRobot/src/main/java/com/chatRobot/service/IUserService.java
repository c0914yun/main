package com.chatRobot.service;

import com.chatRobot.model.User;

import java.util.List;

public interface IUserService {

    public User selectUser(long userId);

    public List<User> selectAllUser();

    public User selectUserByEmail(String email);

    public User addUser(User user);

    public User removeUser(long userId);

    public User modifyUser(User user);

}