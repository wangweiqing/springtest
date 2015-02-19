/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: wangweiqing
* Date: 2015/2/9
* Description:
*/

package com.wwq.springtest.daotest.service.impl;

import com.wwq.springtest.daotest.dao.TestTableMapper;
import com.wwq.springtest.daotest.domain.TestItem;
import com.wwq.springtest.daotest.service.ITestService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

@Service("testService")
public class TestServiceImpl implements ITestService {

  @Resource
  private TestTableMapper testTableMapper;

  @Override
  public void showStr(int id) {
    TestItem testItem = testTableMapper.getMd5(id);
    System.out.println(testItem.toString());
  }

  @Override
  public void showEmptyStr() {
    List<TestItem> testItems = testTableMapper.getTestItem();
    for (TestItem testItem : testItems) {
      System.out.println(testItem.toString());
    }
  }
}
