package com.charan.springboot.CustomerLog.dao;


import com.charan.springboot.CustomerLog.entity.Logmodel;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class LogmodelDAOImpl  implements LogmodelDAO {
    private EntityManager entityManager;
    @Autowired
    public LogmodelDAOImpl(EntityManager theEntityManager) {
        entityManager=theEntityManager;
    }
    @Override
    @Transactional
    public List<Logmodel> findAll() {
        Session cs=entityManager.unwrap(Session.class);
        Query<Logmodel> q=cs.createQuery("from Logmodel",Logmodel.class);
        List<Logmodel> logmodels=q.getResultList();
        return logmodels;
    }
    @Override
    @Transactional
    public void saveit(Logmodel lm) {
        Session cs=entityManager.unwrap(Session.class);
        cs.save(lm);
    }
    @Override
    @Transactional
    public List<Logmodel> findByDate(String date) {
        Session cs=entityManager.unwrap(Session.class);
        String d="";
        d=date;
        Query<Logmodel> q=cs.createQuery("select u from Logmodel u where u.date=:dm");

        q.setParameter("dm", d);
        List<Logmodel> lm=q.getResultList();
        return lm;
    }


}
