package com.cms.dao;

import com.cms.bean.Faculty;
import com.cms.exceptions.FacultyException;

public interface FacultyDao {
	
	public Faculty loginFaculty(String username, String password) throws FacultyException;
	
	
}
