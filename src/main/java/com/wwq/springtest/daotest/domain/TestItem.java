/*
* Copyright (C) 2006-2015 Tuniu All rights reserved
* Author: wangweiqing
* Date: 2015/2/9
* Description:
*/

package com.wwq.springtest.daotest.domain;

import com.wwq.springtest.daotest.domain.gen.TestTableGen;

public class TestItem extends TestTableGen {
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("ID : ");
        sb.append(this.getId());
        sb.append(" MD5 : ");
        sb.append(this.getMd5());
        return sb.toString();
    }
}
