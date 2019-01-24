package com.sunyx.dao.impl;

import com.sunyx.dao.EmpDao;
import com.sunyx.domain.Emp;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * Created by liuli on 2019/1/24.
 */
public class EmpDaoImpl extends SqlSessionDaoSupport implements EmpDao {
    @Override
    public Emp getEmpById(Integer id) {
        SqlSession sqlSession = super.getSqlSession();
        return sqlSession.selectOne("getEmpById",id);
    }

    @Override
    public List<Emp> getEmpByName(String name) {
        SqlSession sqlSession = super.getSqlSession();
        return sqlSession.selectList("getEmpByName",name);
    }

    @Override
    public void insertEmp(Emp emp) {
        SqlSession sqlSession = super.getSqlSession();
        sqlSession.insert("insertEmp",emp);
    }
}
