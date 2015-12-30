package com.shengfeng.service;

import com.shengfeng.po.User;

public interface UserService {
    
    long addUser(User user);
    
    User getUserByUserId(long userId);
}
