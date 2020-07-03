package com.dxk.mongodb.dao;

import com.dxk.mongodb.entity.User;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/7/3
 * Time: 12:46
 * Description: user持久层接口
 */
public interface UserDao {

    void saveUser(User user);

    void removeUser(Integer id);

    void updateUser(User user);

    User findUserById(Integer id);
}
