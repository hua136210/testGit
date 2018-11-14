package com.hhh.dao;

import com.hhh.entity.Emp;

import java.util.List;

public interface EmpDao {
    void insert(Emp emp);

    List<Emp> queryAll();
}
