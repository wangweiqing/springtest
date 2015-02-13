/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: wangweiqing
* Date: 2015/2/9
* Description:
*/

package com.wwqtest.springtest;

import com.wwq.springtest.daotest.service.ITestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/applicationContext.xml"})
public class DBTest {
    @Resource
    ITestService testService;
    @Test
    public void strTest(){
        testService.showStr(1);
        testService.showStr(2);
    }
    @Test
    public void emptyTest(){
        testService.showEmptyStr();
    }
}
