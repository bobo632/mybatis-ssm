package com.sunyx.mapper;

import com.sunyx.domain.Emp;

import java.util.List;

/**
 * Created by liuli on 2019/1/24.
 */
public interface EmpMapper {
    public Emp getEmpById(Integer id);
    public List<Emp> getEmpByName(String name);
    public void insertEmp(Emp emp);
}
