package com.wn.community.controller;

import com.wn.community.entity.DiscussPost;
import com.wn.community.entity.User;
import com.wn.community.service.DiscussPostService;
import com.wn.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    private UserService userService;

    @GetMapping(path = "/index")
    public String getIndexPage(Model model){
        List<DiscussPost> discussPostList = discussPostService.selectDiscussPostByUserId(111);
        List<Map<String, Object>> discussposts = new ArrayList<>();
        for(DiscussPost discussPost : discussPostList){
            Map<String, Object> map = new HashMap<>();
            map.put("discussPost", discussPost);
            User user = userService.selectById(discussPost.getUserId());
            map.put("user", user);
            discussposts.add(map);
        }
        model.addAttribute("discussPosts", discussposts);
        return "index";
    }
}
