package com.chatRobot.service.impl;

import com.chatRobot.dao.IUserDao;
import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

    public List<User> selectAllUser() {
        return this.userDao.selectAllUser();
    }

    public User selectUserByEmail(String email) {
        return this.userDao.selectUserByEmail(email);
    }

    public User addUser(User user) {
        return this.userDao.addUser(user);
    }

    public User removeUser(long userId) {
        return this.userDao.removeUser(userId);
    }

    public User modifyUser(User user) {
        return this.userDao.modifyUser(user);
    }

}