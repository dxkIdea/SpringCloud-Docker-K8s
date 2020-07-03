package com.dxk.mongodb.dao;

import com.dxk.mongodb.entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/7/3
 * Time: 12:49
 * Description: User持久层实现
 */
@Service
public class UserDaoImpl implements UserDao{
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }

    @Override
    public void removeUser(Integer id) {
        mongoTemplate.remove(id);
    }

    @Override
    public void updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));

        Update update = new Update();
        update.set("name","dxk-update");
        mongoTemplate.updateFirst(query,update,User.class);
    }

    @Override
    public User findUserById(Integer id) {
        Query query = new Query(Criteria.where("id").is(id));
        User one = mongoTemplate.findOne(query, User.class);
        return one;
    }
}
