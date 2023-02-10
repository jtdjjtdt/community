package com.wn.community.util;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

/**
 * @author jt
 * @version 1.0
 * @description: 作为客户端，让邮件服务端（sina.com）发送邮件
 * @date 2023/2/10 15:09
 */

@Component
public class MailClient {

    private static final Logger logger = LoggerFactory.getLogger(MailClient.class);

    @Autowired
    private JavaMailSender mailSender;

    //value注释可以引用配置文件application.properties中的属性
    @Value("${spring.mail.username}")
    private String from;

    /**
     * @description:  发送邮件
     * @param: to：收件人邮箱；  subject：邮件主题；   content：邮件内容
     * @return: void
     * @author jt
     * @date: 2023/2/10 15:53
     */
    public void sendMail(String to, String subject, String content) {

        try {
            MimeMessage message = mailSender.createMimeMessage();

            //MimeMessageHelper可以帮助我们给邮件信息类MimeMessage添加发件人，收件人，主题等信息
            MimeMessageHelper helper = new MimeMessageHelper(message);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);

            //true表示能支持发送内容为html文件的邮件
            helper.setText(content, true);
            mailSender.send(helper.getMimeMessage());
        } catch (MessagingException e) {
            logger.error("发送邮件失败:"+ e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
