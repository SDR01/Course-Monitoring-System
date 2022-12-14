package com.cms.dao;

import java.util.List;

import com.cms.bean.CoursePlan;
import com.cms.bean.Faculty;
import com.cms.exceptions.CoursePlanException;
import com.cms.exceptions.FacultyException;

public interface FacultyDao {
	
	public Faculty loginFaculty(String username, String password) throws FacultyException;
	
	public List<CoursePlan> viewCoursePlans() throws CoursePlanException;
	
	public CoursePlan viewCoursePlanByID(int planId) throws CoursePlanException;
	
	public String updatePassword(String username, String password);
}
