package com.wn.community;

import com.wn.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author jt
 * @version 1.0
 * @description: TODO
 * @date 2023/2/10 15:19
 */

@SpringBootTest
public class MailTest {

    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void textMail(){
        mailClient.sendMail("jtdjjtdt@outlook.com", "测试发送文本邮件", "success");
    }

    @Test
    public void htmlMail(){
        //用来给模板传参数
        Context context = new Context();
        context.setVariable("value", "测试");
        String content = templateEngine.process("/mail/demo",context);
        System.out.println(content);
        mailClient.sendMail("jtdjjtdt@outlook.com", "这是一个测试", content);
    }

}
