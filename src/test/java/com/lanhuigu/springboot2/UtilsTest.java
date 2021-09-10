package com.lanhuigu.springboot2;

import com.lanhuigu.springboot2.utils.OSUtils;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: HeChengyao
 * @date: 2021/8/27 9:11
 */
public class UtilsTest {

    private static final Logger logger=LoggerFactory.getLogger(UtilsTest.class);

    @Test
    public static void main(String[] args) {

        System.out.println(OSUtils.cpuUsage());

    }

}
