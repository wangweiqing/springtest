/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved Author: wangweiqing Date: 2015/1/31
 * Description:
 */

package com.wwq.springtest.aoptest.impl;

        import com.wwq.springtest.aoptest.IMethodUnderTest;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

public class MethodUnderTestImpl implements IMethodUnderTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodUnderTestImpl.class);

    @Override
    public void methodUnderTest() {
        //System.out.println("HELLO WORLD!");
        LOGGER.info("HELLO WORLD!");
    }
}
