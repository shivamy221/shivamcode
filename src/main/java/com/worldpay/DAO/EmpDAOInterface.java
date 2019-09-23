package com.worldpay.DAO;

import java.util.List;

import com.worldpay.model.EmpModel;

public interface EmpDAOInterface {
	
	public List<EmpModel> viewAll();
	public void insertEmp(EmpModel emp);
	public EmpModel empSearch(int eno);
	public void deleteEmp(int eno);
	public void updateEmp(EmpModel emp,String ename,int sal);
	
}
