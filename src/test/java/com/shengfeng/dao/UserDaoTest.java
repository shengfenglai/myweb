package com.shengfeng.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shengfeng.TestBase;
import com.shengfeng.po.User;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest extends TestBase{
    
    @Autowired
    private UserDao userDao;
    
    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("xiaolai");
        user.setPassword("123456");
        user.setSex(0);
        user.setMobilephone("18179766500");
        user.setLevel(0);
        user.setImg("http://localhost:8080/shengfeng.jpg");
        long userId = userDao.addUser(user);
        System.out.println(userId);
        Assert.assertNotEquals(0, userId);
    }
}
