/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: wangweiqing
* Date: 2015/2/9
* Description:
*/

package com.wwq.springtest.daotest.dao;

import com.wwq.springtest.daotest.domain.TestItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestTableMapper {
    public int insert(TestItem testItem);
    public TestItem getMd5(@Param("id") Integer id);
    public List<TestItem> getTestItem();
}
