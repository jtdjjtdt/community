package com.wn.community.dao;

import com.wn.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //返回用户名，帖子构成的列表
    List<DiscussPost> selectAll();



    List<DiscussPost> selectByUserId(int userId);


}
