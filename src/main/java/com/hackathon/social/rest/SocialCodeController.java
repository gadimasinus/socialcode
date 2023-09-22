package com.hackathon.social.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hackathon.social.domain.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
public class SocialCodeController implements SocialCodeApi {


    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SocialCodeController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ModelApiResponse> addAssignment(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new assignment in the system", required = true, schema = @Schema()) @Valid @RequestBody CreateAssignment body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 200,\n  \"type\" : \"Login | Admin | Teacher | Learner\",\n  \"message\" : \"Login Successful | Login Failed\"\n}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ModelApiResponse> addCourse(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new course in the system", required = true, schema = @Schema()) @Valid @RequestBody CreateCourse body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 200,\n  \"type\" : \"Login | Admin | Teacher | Learner\",\n  \"message\" : \"Login Successful | Login Failed\"\n}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ModelApiResponse> addUser(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new user in the system", required = true, schema = @Schema()) @Valid @RequestBody CreateUser body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 200,\n  \"type\" : \"Teacher\",\n  \"message\" : \"Login Successful\"\n}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<CourseResponse> findCourseById(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("courseId") Long courseId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CourseResponse>(objectMapper.readValue("{\n  \"courseName\" : \"Some Course\",\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"courseId\" : 10\n}", CourseResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CourseResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CourseResponse>(HttpStatus.OK);
    }

    public ResponseEntity<List<CourseResponse>> findCourseByLearnerId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("learnerId") Long learnerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CourseResponse>>(objectMapper.readValue("[ {\n  \"courseName\" : \"Some Course\",\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"courseId\" : 10\n}, {\n  \"courseName\" : \"Some Course\",\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"courseId\" : 10\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CourseResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CourseResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<List<CourseResponse>> findCourseByTeacherId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("teacherId") Long teacherId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CourseResponse>>(objectMapper.readValue("[ {\n  \"courseName\" : \"Some Course\",\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"courseId\" : 10\n}, {\n  \"courseName\" : \"Some Course\",\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"courseId\" : 10\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CourseResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CourseResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<List<CourseResponse>> findCourses() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CourseResponse>>(objectMapper.readValue("[ {\n  \"courseName\" : \"Some Course\",\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"courseId\" : 10\n}, {\n  \"courseName\" : \"Some Course\",\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"courseId\" : 10\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CourseResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CourseResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<List<AssignmentResponse>> getAssignment() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AssignmentResponse>>(objectMapper.readValue("[ {\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\"\n}, {\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AssignmentResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AssignmentResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<AssignmentResponse> getAssignmentByAssignmentId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("assignmentId") Long assignmentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AssignmentResponse>(objectMapper.readValue("{\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\"\n}", AssignmentResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AssignmentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AssignmentResponse>(HttpStatus.OK);
    }

    public ResponseEntity<List<AssignmentResponse>> getAssignmentByLearnerId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("learnerId") Long learnerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AssignmentResponse>>(objectMapper.readValue("[ {\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\"\n}, {\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AssignmentResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AssignmentResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<List<AssignmentResponse>> getAssignmentByTeacherId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("teacherId") Long teacherId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AssignmentResponse>>(objectMapper.readValue("[ {\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\"\n}, {\n  \"teachers\" : [ 0, 0 ],\n  \"learners\" : [ 6, 6 ],\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AssignmentResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AssignmentResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<List<AssignmentStatusResponse>> getAssignmentStatus() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AssignmentStatusResponse>>(objectMapper.readValue("[ {\n  \"teacher\" : 10,\n  \"learner\" : 10,\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\",\n  \"status\" : \"ASSIGNED | SUBMITTED | EVALUATED | REJECTED\"\n}, {\n  \"teacher\" : 10,\n  \"learner\" : 10,\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\",\n  \"status\" : \"ASSIGNED | SUBMITTED | EVALUATED | REJECTED\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AssignmentStatusResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AssignmentStatusResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<List<AssignmentStatusResponse>> getAssignmentStatusByLearnerId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("learnerId") Long learnerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AssignmentStatusResponse>>(objectMapper.readValue("[ {\n  \"teacher\" : 10,\n  \"learner\" : 10,\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\",\n  \"status\" : \"ASSIGNED | SUBMITTED | EVALUATED | REJECTED\"\n}, {\n  \"teacher\" : 10,\n  \"learner\" : 10,\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\",\n  \"status\" : \"ASSIGNED | SUBMITTED | EVALUATED | REJECTED\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AssignmentStatusResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AssignmentStatusResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<List<AssignmentStatusResponse>> getAssignmentStatusByTeacherId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("teacherId") Long teacherId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AssignmentStatusResponse>>(objectMapper.readValue("[ {\n  \"teacher\" : 10,\n  \"learner\" : 10,\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\",\n  \"status\" : \"ASSIGNED | SUBMITTED | EVALUATED | REJECTED\"\n}, {\n  \"teacher\" : 10,\n  \"learner\" : 10,\n  \"assignmentId\" : 10,\n  \"assignmentName\" : \"Some Course\",\n  \"status\" : \"ASSIGNED | SUBMITTED | EVALUATED | REJECTED\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AssignmentStatusResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AssignmentStatusResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<List<UserResponse>> getUser() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserResponse>>(objectMapper.readValue("[ {\n  \"zip\" : \"12345\",\n  \"firstName\" : \"FirstName\",\n  \"lastName\" : \"LastName\",\n  \"country\" : \"USA\",\n  \"address2\" : \"\",\n  \"city\" : \"Some City\",\n  \"phone\" : \"1234567890\",\n  \"address1\" : \"123 Some St\",\n  \"userType\" : \"Admin | Teacher | Learner\",\n  \"state\" : \"ST\",\n  \"userId\" : 10,\n  \"email\" : \"someone@socialcoding.com\"\n}, {\n  \"zip\" : \"12345\",\n  \"firstName\" : \"FirstName\",\n  \"lastName\" : \"LastName\",\n  \"country\" : \"USA\",\n  \"address2\" : \"\",\n  \"city\" : \"Some City\",\n  \"phone\" : \"1234567890\",\n  \"address1\" : \"123 Some St\",\n  \"userType\" : \"Admin | Teacher | Learner\",\n  \"state\" : \"ST\",\n  \"userId\" : 10,\n  \"email\" : \"someone@socialcoding.com\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<List<UserResponse>> getUserById(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("userType") String userType) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<UserResponse>>(objectMapper.readValue("[ {\n  \"zip\" : \"12345\",\n  \"firstName\" : \"FirstName\",\n  \"lastName\" : \"LastName\",\n  \"country\" : \"USA\",\n  \"address2\" : \"\",\n  \"city\" : \"Some City\",\n  \"phone\" : \"1234567890\",\n  \"address1\" : \"123 Some St\",\n  \"userType\" : \"Admin | Teacher | Learner\",\n  \"state\" : \"ST\",\n  \"userId\" : 10,\n  \"email\" : \"someone@socialcoding.com\"\n}, {\n  \"zip\" : \"12345\",\n  \"firstName\" : \"FirstName\",\n  \"lastName\" : \"LastName\",\n  \"country\" : \"USA\",\n  \"address2\" : \"\",\n  \"city\" : \"Some City\",\n  \"phone\" : \"1234567890\",\n  \"address1\" : \"123 Some St\",\n  \"userType\" : \"Admin | Teacher | Learner\",\n  \"state\" : \"ST\",\n  \"userId\" : 10,\n  \"email\" : \"someone@socialcoding.com\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<UserResponse>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<UserResponse>>(HttpStatus.OK);
    }

    public ResponseEntity<ModelApiResponse> login(@Parameter(in = ParameterIn.DEFAULT, description = "Login as a specific user", required = true, schema = @Schema()) @Valid @RequestBody UserLogin body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 200,\n  \"type\" : \"Login | Admin | Teacher | Learner\",\n  \"message\" : \"Login Successful | Login Failed\"\n}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ModelApiResponse> updateAssignment(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existing assignment in the system", required = true, schema = @Schema()) @Valid @RequestBody UpdateAssignment body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 200,\n  \"type\" : \"Login | Admin | Teacher | Learner\",\n  \"message\" : \"Login Successful | Login Failed\"\n}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ModelApiResponse> updateAssignmentStatus(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existing assignment in the system", required = true, schema = @Schema()) @Valid @RequestBody List<UpdateAssignmentStatus> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 200,\n  \"type\" : \"Login | Admin | Teacher | Learner\",\n  \"message\" : \"Login Successful | Login Failed\"\n}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<ModelApiResponse> updateCourse(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existing course in the system", required = true, schema = @Schema()) @Valid @RequestBody UpdateCourse body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 200,\n  \"type\" : \"Login | Admin | Teacher | Learner\",\n  \"message\" : \"Login Successful | Login Failed\"\n}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

}
