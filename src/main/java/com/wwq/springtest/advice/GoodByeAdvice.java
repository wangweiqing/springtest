/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved Author: wangweiqing Date: 2015/1/31
 * Description:
 */

package com.wwq.springtest.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class GoodByeAdvice implements AfterReturningAdvice {
  @Override
  public void afterReturning(Object o, Method method, Object[] objects, Object o2) throws Throwable {
    System.out.println("GOOD BYE HELLO WORLD!");
  }
}
