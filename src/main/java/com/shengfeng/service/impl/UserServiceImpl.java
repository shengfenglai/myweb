package com.shengfeng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shengfeng.dao.UserDao;
import com.shengfeng.po.User;
import com.shengfeng.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;

    public long addUser(User user) {
        if(user == null) {
            return 0;
        }
        return userDao.addUser(user);
    }

    public User getUserByUserId(long userId) {
        if(userId <= 0) {
            return null;
        }
        return userDao.getUserByUserId(userId);
    }

}
