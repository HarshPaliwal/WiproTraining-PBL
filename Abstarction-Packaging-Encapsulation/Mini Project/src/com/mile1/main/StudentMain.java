package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {

	static Student[] data=new Student[4];
	
	public StudentMain() {

//		for(int i=0;i<data.length;i++) {
//			data[i]=new Student();
//		}
		data[0]=new Student(null, new int[] {85,75,95},"Sekar");
		data[1]=new Student("F",new int[] {30,35,40},null);
		data[2]=null;
		data[3]=new Student("A",null,"Manoj");
	}
	
	public static void main(String[] args) {
		StudentMain sm=new StudentMain();
		StudentReport sr=new StudentReport();
		for(Student s:data) {
			try {
					if(sr.validate(s).equals("VALID")) {
						System.out.println(sr.findGrades(s));
					}
				}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		StudentService ss=new StudentService();
		System.out.print("Number of Null Marks Array : ");
		System.out.println(ss.findNumberOfNullMarksArray(data));
		System.out.print("Number of Null Name : ");
		System.out.println(ss.findNumberOfNullName(data));
		System.out.print("Number of Null Objects : ");
		System.out.println(ss.findNumberOfNullObjects(data));
	}
}
