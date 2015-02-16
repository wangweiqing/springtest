/*
 * Copyright (C) 2006-2015 Tuniu All rights reserved Author: wangweiqing Date: 2015/1/31
 * Description:
 */

package com.wwq.springtest.advice;

import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class WelcomeAdvice implements MethodBeforeAdvice {
  private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeAdvice.class);
  @Override
  public void before(Method method, Object[] objects, Object o) throws Throwable {
    //System.out.print("BEFORE HELLO WORLD!");
      LOGGER.info("BEFORE HELLO WORLD!");
  }
}
