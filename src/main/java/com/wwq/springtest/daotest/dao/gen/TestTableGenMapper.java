package com.wwq.springtest.daotest.dao.gen;

import com.wwq.springtest.daotest.domain.gen.TestTableGen;
import com.wwq.springtest.daotest.domain.gen.TestTableGenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestTableGenMapper {
    int countByExample(TestTableGenExample example);

    int deleteByExample(TestTableGenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestTableGen record);

    int insertSelective(TestTableGen record);

    List<TestTableGen> selectByExample(TestTableGenExample example);

    TestTableGen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestTableGen record, @Param("example") TestTableGenExample example);

    int updateByExample(@Param("record") TestTableGen record, @Param("example") TestTableGenExample example);

    int updateByPrimaryKeySelective(TestTableGen record);

    int updateByPrimaryKey(TestTableGen record);
}