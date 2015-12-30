package com.shengfeng.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shengfeng.TestBase;
import com.shengfeng.po.User;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest extends TestBase {

    @Autowired
    private UserService userService;
    
    
    @Test 
    public void testAddUser() {
        User user = new User();
        user.setUsername("zhousan");
        user.setPassword("123");
        user.setSex(0);
        user.setMobilephone("18779883833");
        user.setLevel(0);
        user.setImg("http://shengfeng.jpg");
        long userId = userService.addUser(user);
        System.out.println(userId);
        Assert.assertNotEquals(0, userId);
    }
    
    
    @Test
    public void testGetUserByUserId() {
        User user = userService.getUserByUserId(5);
        System.out.println(user.getUsername());
        Assert.assertNotNull(user);
    }

}
