package com.dokstudio.springboot2.controller;

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
        StringUtils.equals("123","123");

        logger.info(">>>>>> huge");
        return "huge";
    }

}
