package com.shengfeng;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
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

    @Before
    public void before() {
        System.out.println("before() in TestBase");
        System.out.flush();
    }

    @After
    public void after() {
        System.out.println("after() in TestBase");
        System.out.flush();
    }
}