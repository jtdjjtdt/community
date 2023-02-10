package com.wn.community;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author jt
 * @version 1.0
 * @description: TODO
 * @date 2023/2/10 13:22
 */


@SpringBootTest
public class LogbackTest {

    final static Logger logger = LoggerFactory.getLogger(LogbackTest.class);

    @Test
    public void logbackTest(){
        logger.debug("debug log");
        logger.info("entering application");
        logger.warn("warn log");
        logger.error("do it again");

    }
}
