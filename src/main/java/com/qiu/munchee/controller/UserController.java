package com.qiu.munchee.controller;

import com.qiu.munchee.entity.User;
import com.qiu.munchee.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    //用户登陆
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(User user){
        User user1 = userMapper.selectByPrimaryKey("1");
        System.out.println("user1.toString() = " + user1.toString());
        return "success";
    }
    //用户注册
    @RequestMapping("/addUser")
    public String addUser(User user){
        return "success";
    }
}
