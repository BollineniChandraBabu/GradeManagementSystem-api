package com.revature.gms.controller;

import java.util.List;

import com.revature.gms.exception.ServiceException;
import com.revature.gms.model.Grades;
import com.revature.gms.services.GradesServices;

public class GradesController {
	boolean result=false;
	GradesServices gradesServices = new GradesServices();
	Grades grades=new Grades();

	
	public List<Grades> viewGrades() throws ServiceException
	{
		return gradesServices.viewGrades();
	}
	public boolean checkGradeAvailability(char grade) throws ServiceException {
		return result=gradesServices.checkGradeAvailability(grade);
	}
	public boolean updateGradeRange(String grade, int minmark, int maxmark) throws ServiceException {
		grades.setGrade(grade);
		grades.setMinMark(minmark);
		grades.setMaxMark(maxmark);
	return	gradesServices.updateGradeRange(grades);
	}
	
	
	public String getGrade(int mark)
	{
		return gradesServices.getGrade(mark);
	}
		
	}

