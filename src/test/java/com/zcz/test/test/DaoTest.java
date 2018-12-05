package com.zcz.test.test;

import com.zcz.o2o.dao.AreaMapper;
import com.zcz.o2o.entity.Area;
import com.zcz.test.BaseAbstractTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DaoTest extends BaseAbstractTest {

    @Autowired
    private AreaMapper areaMapper;

    @Test
    public void testQueryAreaDao(){
        List<Area> areas = areaMapper.queryAll();
        System.out.println(areas);
        Assert.assertEquals(2, areas.size());


    }




}
