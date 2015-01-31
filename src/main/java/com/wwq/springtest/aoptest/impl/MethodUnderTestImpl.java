/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: wangweiqing
* Date: 2015/1/31
* Description:
*/

package com.wwq.springtest.aoptest.impl;

import com.wwq.springtest.aoptest.IMethodUnderTest;

public class MethodUnderTestImpl implements IMethodUnderTest{
    @Override
    public void methodUnderTest() {
        System.out.println("HELLO WORLD!");
    }
}
