package com.lanhuigu.springboot2.controller;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jiuzhoumu
 * @date 2021/7/21 11:17
 * @projectName springboot2
 * @title: UserController
 * @description: TODO
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/huge")
    public String huge() {
        boolean b = StringUtils.equals("123", "123");

        String alert = "警告，警告！";
        String warn = "warn,warn!";
        logger.info(">>>>>> huge");
        logger.warn("{}! alert = {}", warn, alert);
        logger.warn(">>>>>> huge");
        return "huge";
    }

}
