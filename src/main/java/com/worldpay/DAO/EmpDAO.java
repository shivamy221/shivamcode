package com.worldpay.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.worldpay.Test;
import com.worldpay.model.EmpModel;

@Repository
public class EmpDAO implements EmpDAOInterface{
	
	@Autowired
	private Test test;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public EmpDAO() {
		System.out.println(test+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=========================>");
	}
	
	
	public List<EmpModel> viewAll(){
		
		System.out.println("@@@@@@@@@@@ reached DAO @@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(sessionFactory);
		
		Session session = sessionFactory.openSession();
		@SuppressWarnings("deprecation")
		Criteria cr = session.createCriteria(EmpModel.class);
		@SuppressWarnings("unchecked")
		List<EmpModel> EmpList = cr.list();
		System.out.println("@@@@@@@@@@@ End of DAO @@@@@@@@@@@@@@@@@@@@@@");
		return EmpList;	
	}
	
	public void insertEmp(EmpModel emp) {
		
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
	
		session.save(emp);
		
		tr.commit();
		session.close();
	}
	
	public EmpModel empSearch(int eno) {
		
		Session session = sessionFactory.openSession();
		
		EmpModel emp = (EmpModel)session.get(EmpModel.class,eno);
		return emp;		
	}
	
	public void deleteEmp(int eno) {
		
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		EmpModel emp = (EmpModel)session.get(EmpModel.class,eno);
		session.delete(emp);
		
		tr.commit();
		session.close();
	}

	public void updateEmp(EmpModel emp,String ename,int sal) {
		
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		emp.setEname(ename);
		emp.setSal(sal);
		
		session.update(emp);
		tr.commit();
		session.close(); 
	}
}
