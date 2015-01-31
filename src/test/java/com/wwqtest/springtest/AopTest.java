/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: wangweiqing
* Date: 2015/1/31
* Description:
*/

package com.wwqtest.springtest;

import com.wwq.springtest.aoptest.IMethodUnderTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/applicationContext.xml" })
public class AopTest {
    @Resource
    private IMethodUnderTest methodUnderTest;
    @Resource
    private IMethodUnderTest methodAfterTest;
    @Test
    public void beforeTest(){
        methodUnderTest.methodUnderTest();
    }
    @Test
    public void afterTest(){
        methodAfterTest.methodUnderTest();
    }
}
