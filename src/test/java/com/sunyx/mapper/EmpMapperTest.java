package com.sunyx.mapper;

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
public class EmpMapperTest {
    @Resource
    private EmpMapper empMapper;
    @Test
    public void test1(){
        Emp emp = empMapper.getEmpById(3);
        System.out.println(emp);
    }
}
