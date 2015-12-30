package com.shengfeng.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shengfeng.po.User;
import com.shengfeng.service.UserService;


@Controller
@RequestMapping("/user")
public class UserAction {
    
    @Autowired
    @Qualifier("userService")
    private UserService userService;
    
    @RequestMapping("/userInfo.html")
    public ModelAndView getUserInfo() {
        User user = userService.getUserByUserId(1);
        Map<String,Object> userInfoMap = new HashMap<String,Object>();
        userInfoMap.put("username",user.getUsername());
        userInfoMap.put("password",user.getPassword());
        userInfoMap.put("level",user.getLevel());
        userInfoMap.put("sex",user.getSex());
        userInfoMap.put("mobilephone",user.getMobilephone());
        userInfoMap.put("img",user.getImg());
        
        ModelAndView view = new ModelAndView("/user/userInfo");
        view.addObject("userInfo",userInfoMap);
        return view;
        
    }
}
