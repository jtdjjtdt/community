package com.wn.community.service;

import com.wn.community.dao.DiscussPostMapper;
import com.wn.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> selectByUserId(int userId, int offset, int limit){
        return discussPostMapper.selectByUserId(userId, offset, limit);
    }

    public int selectPostRows(int userId){
        return discussPostMapper.selectPostRows(userId);
    }

}
