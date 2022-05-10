package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;

/**
 * @author yzw
 * @version 1.0
 */
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {
    @Autowired
    private MailClient mailClient;
    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail() {

        mailClient.sendMail("992685563@qq.com", "Test", "志伟你是最棒的");

    }

    @Test
    public void testHtmlEmail() {
        Context context = new Context();
        context.setVariable("username", "sunday");

        String content = templateEngine.process("mail/demo", context);
        System.out.println(content);

        mailClient.sendMail("18764291033@163.com","HTML", content);
    }

}
