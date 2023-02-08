package com.wn.community.dao;

import com.wn.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//@Repository
public interface UserMapper {

    public List<User> selectAll();

    public User selectById(int id);

    public User selectByUsername(String username);

}
