package com.shengfeng.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.shengfeng.po.User;

@Repository
public interface UserMapper {
    
    long addUser(User user);
    
    User getUserByUserId(@Param("userId")long userId);
}
