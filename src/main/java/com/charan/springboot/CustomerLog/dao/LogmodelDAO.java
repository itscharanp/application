package com.charan.springboot.CustomerLog.dao;

import com.charan.springboot.CustomerLog.entity.Logmodel;

import java.util.List;

public interface LogmodelDAO {
    public List<Logmodel> findAll();
    public void saveit(Logmodel lm);
    public List<Logmodel> findByDate(String date);
}
