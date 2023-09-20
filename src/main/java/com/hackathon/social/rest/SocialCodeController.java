package com.hackathon.social.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.social.domain.Teacher;
import com.hackathon.social.domain.Student;

@RestController
public class SocialCodeController {
	 @RequestMapping(method = RequestMethod.GET,  path =  "/version", produces = "application/json")
	 public String getBook() {
	        return "SocialCode Service API version 1.0";
	 }
	 
	 public Teacher addTeacher() {
		 return new Teacher("Test","Test");
	 }
	 
	 public Teacher removeTeacher() {
		 return new Teacher("Test","Test");
	 }
	 
	 public Student addStudent() {
		 return new Student("Test","Test");
	 }
	 
	 public Student removeStudent() {
		 return new Student("Test","Test");
	 }
	 
	 
}
