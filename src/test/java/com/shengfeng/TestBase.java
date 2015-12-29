package com.shengfeng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author shengfenglai
 * @since 2015.10.30
 */
@ContextConfiguration(locations = {"classpath:junit-test.xml"})
public class TestBase {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass() in TestBase");
        System.out.flush();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass() in TestBase");
        System.out.flush();
    }

}