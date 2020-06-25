package com.mile1.JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

public class TestStudentService {

	@Test
	public void testFindNumberOfNullMarksArray() {
		StudentService ss=new StudentService();
		Student[] data=new Student[5];
		data[0]=new Student(null,null,"Name1");
		data[1]=new Student(null,new int[] {45,46,46},"Name2");
		data[2]=new Student(null,null,"Name3");
		data[3]=new Student(null,new int[] {23,35,12},"Name4");
		data[4]=new Student(null,null,"Name5");
		assertEquals(3,ss.findNumberOfNullMarksArray(data));
	}

	@Test
	public void testFindNumberOfNullName() {
		StudentService ss=new StudentService();
		Student[] data=new Student[5];
		data[0]=new Student(null,new int[] {45,46,46},null);
		data[1]=new Student(null,new int[] {45,46,46},"Name2");
		data[2]=new Student(null,null,null);
		data[3]=new Student(null,new int[] {23,35,12},"Name4");
		data[4]=new Student(null,new int[] {25,46,56},null);
		assertEquals(3,ss.findNumberOfNullName(data));
	}

	@Test
	public void testFindNumberOfNullObjects() {
		StudentService ss=new StudentService();
		Student[] data=new Student[5];
		data[0]=new Student(null,new int[] {45,46,46},null);
		data[1]=null;
		data[2]=new Student(null,null,null);
		data[3]=new Student(null,new int[] {23,35,12},"Name4");
		data[4]=null;
		assertEquals(2,ss.findNumberOfNullObjects(data));
	}

}
