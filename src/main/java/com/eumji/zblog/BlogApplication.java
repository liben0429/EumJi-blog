package com.eumji.zblog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * com.eumji.zblog.Application.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:EumJi
 * @year: 2017
 * @month: 04
 * @day: 02
 * @time: 2017/4/2
 */
@SpringBootApplication
@EnableScheduling
public class BlogApplication {

    private static Logger logger = LoggerFactory.getLogger(BlogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class,args);
        logger.info("个人博客服务启动完毕...");
    }
}
