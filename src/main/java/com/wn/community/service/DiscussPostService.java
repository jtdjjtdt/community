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

    public List<DiscussPost> selectAll(){
        return discussPostMapper.selectAll();
    }

    public List<DiscussPost> selectDiscussPostByUserId(int userId){

        return discussPostMapper.selectByUserId(userId);
    }

}
