package com.hackathon.social.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.social.domain.Teacher;
import com.hackathon.social.domain.Student;

@RestController
public class SocialCodeController {

    @RequestMapping(method = RequestMethod.GET, path = "/version", produces = "application/json")
    public String getBook() {
        return "Social code app api version 1.0";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/teacher", produces = "application/json")
    public Teacher addTeacher(Teacher teacher) {
        return new Teacher("Test", "Test");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/teacher", produces = "application/json")
    public Teacher getTeacher() {
        return new Teacher("Test", "Test");
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/teacher", produces = "application/json")
    public Teacher removeTeacher() {
        return new Teacher("Test", "Test");
    }

    @RequestMapping(method = RequestMethod.POST, path = "/student", produces = "application/json")
    public Student addStudent(Student student) {
        return new Student("Test", "Test");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/student", produces = "application/json")
    public Student getStudent() {
        return new Student("Test", "Test");
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/student", produces = "application/json")
    public Student removeStudent() {
        return new Student("Test", "Test");
    }

}
