package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

	public StudentService() {
		
	}
	
	public int findNumberOfNullMarksArray(Student[] s) {
		int c=0;
		for(Student stu:s) {
			if(stu!=null) {
				if(stu.getMarks()==null)
					c++;
			}
		}
		return c;
	}
	
	public int findNumberOfNullName(Student[] s) {
		int c=0;
		for(Student stu:s) {
			if(stu!=null) {
				if(stu.getName()==null)
					c++;
			}
		}
		return c;
	}
	
	public int findNumberOfNullObjects(Student[] s) {
		int c=0;
		for(Student stu:s) {
			if(stu==null) c++;
		}
		return c;
	}
	
}
