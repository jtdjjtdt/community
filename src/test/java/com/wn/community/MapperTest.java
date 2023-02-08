package com.wn.community;

import com.wn.community.dao.DiscussPostMapper;
import com.wn.community.dao.UserMapper;
import com.wn.community.entity.DiscussPost;
import com.wn.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testMapper(){
//        User user = userMapper.selectById(102);
//        System.out.println(user);
//
//        //测试lombok是否成功使用
//        System.out.println(user.getId());

//        List<Object> list = discussPostMapper.selectAll();
//        System.out.println(list);

        List<DiscussPost> list = discussPostMapper.selectByUserId(101);
        System.out.println(list);
        System.out.println(list.size());
    }
}
