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

    List<User>  getUserLike(String value);

    //查询全部用户
    List<User> getUserList();

    //根据id查询用户
    User getUserById(int id);

    //根据id查询用户
    User getUserById2(Map<String,Object> map);

    //万能的map
    //实体类的字段或者参数过多,我们考虑使用map
    int addUser2(Map<String,Object> map);

    //insert一个用户
    int addUser(User user);

    //修改用户
    int upDateUser(User user);

    //删除用户
    int deleteUser(int id);

    //
}
