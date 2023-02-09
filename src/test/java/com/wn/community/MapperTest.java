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

/**
 * @description:
 * @author jt
 * @date 2023/2/8 16:20
 */
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

        List<DiscussPost> list = discussPostMapper.selectByUserId(0, 0, 10);
        System.out.println(list);
        System.out.println(list.get(1).getStatus());
        System.out.println(discussPostMapper.selectPostRows(0));
    }
/**
 * @description:  这是一个测试用模板注释方法的方法
 * @param:
 * @return: void
 * @author jt
 * @date: 2023/2/8 16:19
 */
    public void test1(){

    }
}
