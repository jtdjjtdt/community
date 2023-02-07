package com.wn.community.dao;

import com.wn.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
//@Repository
public interface UserMapper {

    public User selectById(int id);


}
