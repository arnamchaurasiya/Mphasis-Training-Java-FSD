package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;


import com.test.Employee;
import com.test.HibernateUtil;

import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class EmployeeDao {

    public static SessionFactory getDBSessionF() {
        SessionFactory factory = null;
        try {
            factory = HibernateUtil.getSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public void saveEmployee(Employee emp) {
        Session session = getDBSessionF().openSession();
        Transaction t = session.beginTransaction();
        session.persist(emp);
        t.commit();
        session.close();
    }

    public List<Employee> listAllEmployees() {
        Session session = getDBSessionF().openSession();
        Query<Employee> q = session.createQuery("from Employee", Employee.class);
        List<Employee> list = q.list();
        session.close();
        return list;
    }

    public void updateEmployee(Employee updated) {
        Session session = getDBSessionF().openSession();
        Transaction t = session.beginTransaction();

        Employee dbObj = session.find(Employee.class, updated.getId());

        if (dbObj != null) {
            dbObj.setName(updated.getName());
        }

        session.persist(dbObj);
        t.commit();
        session.close();
    }

    public List<Employee> getAllNamed() {
        Session session = getDBSessionF().openSession();
        List<Employee> list = session.getNamedQuery("Employee.findAll").list();
        session.close();
        return list;
    }


public List<Employee> getByNameCriteriaBuilder1(String name) {
    Session session = getDBSessionF().openSession();

    CriteriaBuilder cb = session.getCriteriaBuilder();
    CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
    Root<Employee> root = cq.from(Employee.class);

    cq.select(root).where(cb.equal(root.get("name"), name));

    List<Employee> list = session.createQuery(cq).getResultList();
    session.close();
    return list;
}


    public List<Employee> getByNameCriteriaBuilder(String name) {
        Session session = getDBSessionF().openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
        Root<Employee> root = cq.from(Employee.class);

        cq.select(root).where(cb.equal(root.get("name"), name));

        List<Employee> list = session.createQuery(cq).getResultList();
        session.close();
        return list;
    }
}