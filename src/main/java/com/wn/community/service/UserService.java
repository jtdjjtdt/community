package com.wn.community.service;

import com.wn.community.dao.UserMapper;
import com.wn.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public User selectById(int id){
        return userMapper.selectById(id);
    }

    public User selectByUsername(String username){
        return userMapper.selectByUsername(username);
    }
}
