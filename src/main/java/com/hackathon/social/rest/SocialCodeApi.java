package com.hackathon.social.rest;

import com.hackathon.social.domain.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Validated
public interface SocialCodeApi {

    @Operation(summary = "Add a new assignment", description = "Add a new assignment to the system", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),

            @ApiResponse(responseCode = "405", description = "Invalid input")})
    @RequestMapping(value = "/api/assignment",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> addAssignment(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new assignment in the system", required = true, schema = @Schema()) @Valid @RequestBody CreateAssignment body);


    @Operation(summary = "Add a new course", description = "", tags = {"Course"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),

            @ApiResponse(responseCode = "405", description = "Invalid input")})
    @RequestMapping(value = "/api/course",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> addCourse(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new course in the system", required = true, schema = @Schema()) @Valid @RequestBody CreateCourse body);


    @Operation(summary = "Add a new user", description = "Add a new user to the system", tags = {"User"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),

            @ApiResponse(responseCode = "405", description = "Invalid input")})
    @RequestMapping(value = "/api/user",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> addUser(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new user in the system", required = true, schema = @Schema()) @Valid @RequestBody CreateUser body);


    @Operation(summary = "Finds course by id", description = "", tags = {"Course"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CourseResponse.class))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/course/{courseId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<CourseResponse> findCourseById(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("courseId") Long courseId);


    @Operation(summary = "Finds course by learner id", description = "", tags = {"Course"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CourseResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/course/{learnerId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<CourseResponse>> findCourseByLearnerId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("learnerId") Long learnerId);


    @Operation(summary = "Finds course by teacher id", description = "", tags = {"Course"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CourseResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/course/{teacherId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<CourseResponse>> findCourseByTeacherId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("teacherId") Long teacherId);


    @Operation(summary = "Finds courses", description = "Multiple status values can be provided with comma separated strings", tags = {"Course"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CourseResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/course",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<CourseResponse>> findCourses();


    @Operation(summary = "Finds assignments", description = "Multiple status values can be provided with comma separated strings", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AssignmentResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/assignment",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<AssignmentResponse>> getAssignment();


    @Operation(summary = "Find assignment by assignment id", description = "", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AssignmentResponse.class))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/assignment/{assignmentId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<AssignmentResponse> getAssignmentByAssignmentId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("assignmentId") Long assignmentId);


    @Operation(summary = "Find assignment by learner id", description = "", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AssignmentResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/assignment/{learnerId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<AssignmentResponse>> getAssignmentByLearnerId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("learnerId") Long learnerId);


    @Operation(summary = "Find assignment by teacher id", description = "", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AssignmentResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/assignment/{teacherId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<AssignmentResponse>> getAssignmentByTeacherId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("teacherId") Long teacherId);


    @Operation(summary = "Finds assignments", description = "Multiple status values can be provided with comma separated strings", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AssignmentStatusResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/assignment/status",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<AssignmentStatusResponse>> getAssignmentStatus();


    @Operation(summary = "Finds assignments by learner id", description = "", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AssignmentStatusResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/assignment/status/{learnerId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<AssignmentStatusResponse>> getAssignmentStatusByLearnerId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("learnerId") Long learnerId);


    @Operation(summary = "Finds assignments by teacher id", description = "", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AssignmentStatusResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/assignment/status/{teacherId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<AssignmentStatusResponse>> getAssignmentStatusByTeacherId(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("teacherId") Long teacherId);


    @Operation(summary = "Finds users", description = "Multiple status values can be provided with comma separated strings", tags = {"User"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/user",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<UserResponse>> getUser();


    @Operation(summary = "Find user by id", description = "", tags = {"User"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserResponse.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/api/user/{userType}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<UserResponse>> getUserById(@Parameter(in = ParameterIn.PATH, description = "", required = true, schema = @Schema()) @PathVariable("userType") String userType);


    @Operation(summary = "Login API", description = "", tags = {"Login"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),

            @ApiResponse(responseCode = "405", description = "Invalid input")})
    @RequestMapping(value = "/api/login",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> login(@Parameter(in = ParameterIn.DEFAULT, description = "Login as a specific user", required = true, schema = @Schema()) @Valid @RequestBody UserLogin body);


    @Operation(summary = "Update an existing assignment", description = "Update an existing assignment in the system", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),

            @ApiResponse(responseCode = "405", description = "Invalid input")})
    @RequestMapping(value = "/api/assignment",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<ModelApiResponse> updateAssignment(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existing assignment in the system", required = true, schema = @Schema()) @Valid @RequestBody UpdateAssignment body);


    @Operation(summary = "Update an existing assignment", description = "", tags = {"Assignment"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),

            @ApiResponse(responseCode = "405", description = "Invalid input")})
    @RequestMapping(value = "/api/assignment/status",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> updateAssignmentStatus(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existing assignment in the system", required = true, schema = @Schema()) @Valid @RequestBody List<UpdateAssignmentStatus> body);


    @Operation(summary = "Update an existing course", description = "Update an existing course in the system", tags = {"Course"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))),

            @ApiResponse(responseCode = "405", description = "Invalid input")})
    @RequestMapping(value = "/api/course",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    ResponseEntity<ModelApiResponse> updateCourse(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existing course in the system", required = true, schema = @Schema()) @Valid @RequestBody UpdateCourse body);

}

