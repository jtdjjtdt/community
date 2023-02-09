package com.wn.community.dao;

import com.wn.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectByUserId(int userId, int offset, int limit);

    //返回某个用户发布的帖子总数（不包括拉黑的）
    int selectPostRows(int userId);



}
