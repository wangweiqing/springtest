/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: wangweiqing
* Date: 2015/1/31
* Description:
*/

package com.wwq.springtest.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class WelcomeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.print("BEFORE HELLO WORLD!");
    }
}
