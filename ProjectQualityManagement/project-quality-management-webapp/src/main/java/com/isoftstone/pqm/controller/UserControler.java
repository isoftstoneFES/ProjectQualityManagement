package com.isoftstone.pqm.controller;

import com.github.pagehelper.PageHelper;
import com.isoftstone.pqm.model.User;
import com.isoftstone.pqm.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Jin Guangyu on 2017/2/16.
 */
@RestController
public class UserControler {

    @Autowired
    UserService userService;

    @RequestMapping("/likeName")
    public List<User> selectUser(String name) {
        System.out.println("这是Controler方法~");
//        PageHelper.startPage(1, 2);
        List<User> list = userService.findUserByName(name);
        return list;
    }

}
