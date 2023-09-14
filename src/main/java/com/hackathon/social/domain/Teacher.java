package com.hackathon.social.domain;

public class Teacher extends Person {
	private int numCourses;
	private String[] courses;

	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[10];
	}

	public boolean addCourse(String course) {
      return true;
	}
	
	public boolean removeCourse(String course) {
	      return true;
	}
	
	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}
}
