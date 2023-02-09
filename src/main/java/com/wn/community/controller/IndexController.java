package com.wn.community.controller;

import com.wn.community.entity.DiscussPost;
import com.wn.community.entity.Page;
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
    public String getIndexPage(Model model, Page page){
        page.setRows(discussPostService.selectPostRows(0));
        page.setPath("index");

        List<DiscussPost> discussPostList = discussPostService.selectByUserId(0, page.getOffset(), page.getLimit());
        List<Map<String, Object>> discussPosts = new ArrayList<>();
        for(DiscussPost discussPost : discussPostList){
            Map<String, Object> map = new HashMap<>();
            map.put("discussPost", discussPost);
            User user = userService.selectById(discussPost.getUserId());
            map.put("user", user);
            discussPosts.add(map);
        }
        model.addAttribute("discussPosts", discussPosts);
        return "index";
    }



}
