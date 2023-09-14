package com.hackathon.social.domain;

public class Student extends Person {
	private int numCourses;
	private String[] courses;
	private int[] grades;

	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[10];
		grades = new int[10];
	}

	 public void addCourseGrade(String course, int grade) {
		
	 }
	 
	@Override
	public String toString() {
		return "Student: " + super.toString();
	}
}
