package com.sunyx.dao;

import com.sunyx.domain.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by liuli on 2019/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo1 {
    @Resource(name = "empDao")
    private EmpDao empDao;
    @Test
    public void test1(){
        Emp emp = empDao.getEmpById(3);
        System.out.println(emp);
    }
}
