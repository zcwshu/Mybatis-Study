package com.zcw.dao;

import com.zcw.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @Author: AndrewBar
 * @Date: Created in 10:02 2020/7/12
 */
//namespace和接口包名要一致
public interface UserMapper {

    //根据id查询用户
    User getUserById(int id);

    List<User> getUserList();

}
