package com.revature.gms.controller;

import java.util.List;

import com.revature.gms.model.Departments;
import com.revature.gms.services.DepartmentsServices;

public class DepartmentsController {
	DepartmentsServices departmentsServices=new DepartmentsServices();
	public List<Departments> viewDepartments()
	{
	return	departmentsServices.viewDepartments();
	}
	public boolean checkDepartment(int id)
	{
		return departmentsServices.checkDepartment(id);
	}
}
