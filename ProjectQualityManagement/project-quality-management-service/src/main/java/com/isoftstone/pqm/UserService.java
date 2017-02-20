package com.isoftstone.pqm;

/**
 * Created by Jin Guangyu on 2017/2/16.
 */

import com.isoftstone.pqm.mapper.UserMapper;
import com.isoftstone.pqm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> findUserByName(String name){
        System.out.println("这是Service方法~");
        return userMapper.findUserByName(name);
    }
}
