package com.mile1.bean;

public class Student {

	private String name;
	private int[] marks;
	private String grade;

	public Student() {
		
	}
	
	public Student(String grade,int[] marks,String name) {
		this.setName(name);
		this.marks=marks;
		this.setGrade(grade);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
		
}
