package com.isoftstone.pqm.mapper;

import com.isoftstone.pqm.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Jin Guangyu on 2017/2/16.
 */
public interface UserMapper {

    //@Select("select * from `user` where name = #{name}")
    public List<User> findUserByName(String name);
}
