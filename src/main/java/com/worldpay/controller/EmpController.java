package com.worldpay.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.worldpay.DAO.EmpDAO;
import com.worldpay.model.EmpModel;

@Controller
public class EmpController {
	
	@RequestMapping("InsertPage")
	public ModelAndView insertPage() {
		ModelAndView mv=new ModelAndView("InsertPage");
		return mv;
	}
	
	@RequestMapping("EmpSearch")
	public ModelAndView EmpSeach() {
		ModelAndView mv=new ModelAndView("EmpSearch");
		return mv;
	}
	
	@RequestMapping("Delete") 
	public ModelAndView deletePage(){
		ModelAndView mv = new ModelAndView("DeletePage");
		return mv;
	}
	
	@RequestMapping("Update")
	public ModelAndView Update() {
		ModelAndView mv = new ModelAndView("UpdatePage");
		return mv;
	}
	
	@RequestMapping("AddEmp")
	public ModelAndView insertEmp(@ModelAttribute("info") EmpModel emp) {
		
		EmpDAO DAO = new EmpDAO();
		DAO.insertEmp(emp);
		ModelAndView mv = new 	ModelAndView("AddSuccess");
		return mv;
	}
	
	@RequestMapping("RetriveAll")
	public ModelAndView retriveAll() {
		System.out.println("@@@@@@@@@@@ reached controller @@@@@@@@@@@@@@@@@@@@@@");
		EmpDAO DAO = new EmpDAO();
		List<EmpModel> EmpList = DAO.viewAll();
		ModelAndView mv = new ModelAndView("AllEmp");
		mv.addObject("EmpList", EmpList);
		System.out.println("@@@@@@@@@@@ end of controller @@@@@@@@@@@@@@@@@@@@@@");
		return mv;
	}
	
	@RequestMapping("empSearch")
	public ModelAndView empSearch(int eno){
		
		EmpDAO DAO = new EmpDAO();
		EmpModel emp = DAO.empSearch(eno);
		ModelAndView mv = new ModelAndView("searchResult");
		mv.addObject("emp", emp);
		return mv;
		
	}
	
	@RequestMapping("deleteEmp")
	public ModelAndView deleteEmp(int eno) {
	
		EmpDAO DAO = new EmpDAO();
		EmpModel emp = DAO.empSearch(eno);
		DAO.deleteEmp(eno);
		ModelAndView mv = new ModelAndView("deleteResult");
		mv.addObject("emp", emp);
		return mv;
	}
	
	@RequestMapping("updateEmp")
	public ModelAndView updateEmp(int eno,String ename,int sal) {
		EmpDAO DAO = new EmpDAO();
		EmpModel emp = DAO.empSearch(eno);
		DAO.updateEmp(emp, ename, sal);
		ModelAndView mv = new ModelAndView("updateResult");
		mv.addObject("emp", emp);
		return mv;
	}
}
