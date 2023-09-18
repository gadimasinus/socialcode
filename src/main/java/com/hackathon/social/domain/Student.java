package com.hackathon.social.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
}
