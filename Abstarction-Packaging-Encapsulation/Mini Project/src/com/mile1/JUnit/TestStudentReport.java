package com.mile1.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;

public class TestStudentReport {

	//Test Case 1
		@Test
		public void testFindGradesAplus() {
			StudentReport sr=new StudentReport();
			Student s=new Student(null,new int[] {85,87,83},"John");
			assertEquals("A+", sr.findGrades(s));				
		}
		
		//Test Case 2
		@Test
		public void testFindGradesF() {
			StudentReport sr=new StudentReport();
			Student s=new Student(null,new int[] {23,87,97},"Manoj");
			assertEquals("F", sr.findGrades(s));
		}
		
		//Test Case 3
		@Test(expected=NullStudentObjectException.class)
		public void testValidateNSOE() throws NullStudentObjectException, NullMarksArrayException, NullNameException {
			StudentReport sr=new StudentReport();
			Student s=null;
			sr.validate(s);
		}

		//Test Case 4
		@Test(expected=NullNameException.class)
		public void testValidateNNE() throws NullMarksArrayException, NullNameException, NullStudentObjectException {
			StudentReport sr=new StudentReport();
			Student s=new Student(null,new int[] {45,56,78},null) ;
			sr.validate(s);
		}
		
		//Test Case 5
		@Test(expected=NullMarksArrayException.class)
		public void testValidateNMAE() throws NullMarksArrayException, NullNameException, NullStudentObjectException {
			StudentReport sr=new StudentReport();
			Student s=new Student(null,null,"Name");
			sr.validate(s);
		}
}
