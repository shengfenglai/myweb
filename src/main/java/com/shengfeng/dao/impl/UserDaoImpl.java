package com.shengfeng.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shengfeng.dao.UserDao;
import com.shengfeng.dao.mapper.UserMapper;
import com.shengfeng.po.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;
    
    public long addUser(User user) {
        userMapper.addUser(user);
        return user.getId();
    }
    
}
