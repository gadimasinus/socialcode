package com.hackathon.social.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AssignmentResponse
 */
@Validated
public class AssignmentResponse {
    @JsonProperty("assignmentId")
    private Long assignmentId = null;

    @JsonProperty("assignmentName")
    private String assignmentName = null;

    @JsonProperty("teachers")
    @Valid
    private List<Integer> teachers = new ArrayList<Integer>();

    @JsonProperty("learners")
    @Valid
    private List<Integer> learners = new ArrayList<Integer>();

    public AssignmentResponse assignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
        return this;
    }

    /**
     * Get assignmentId
     *
     * @return assignmentId
     **/
    @Schema(example = "10", required = true, description = "")
    @NotNull

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public AssignmentResponse assignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
        return this;
    }

    /**
     * Get assignmentName
     *
     * @return assignmentName
     **/
    @Schema(example = "Some Course", required = true, description = "")
    @NotNull

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public AssignmentResponse teachers(List<Integer> teachers) {
        this.teachers = teachers;
        return this;
    }

    public AssignmentResponse addTeachersItem(Integer teachersItem) {
        this.teachers.add(teachersItem);
        return this;
    }

    /**
     * Get teachers
     *
     * @return teachers
     **/
    @Schema(required = true, description = "")
    @NotNull

    public List<Integer> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Integer> teachers) {
        this.teachers = teachers;
    }

    public AssignmentResponse learners(List<Integer> learners) {
        this.learners = learners;
        return this;
    }

    public AssignmentResponse addLearnersItem(Integer learnersItem) {
        this.learners.add(learnersItem);
        return this;
    }

    /**
     * Get learners
     *
     * @return learners
     **/
    @Schema(required = true, description = "")
    @NotNull

    public List<Integer> getLearners() {
        return learners;
    }

    public void setLearners(List<Integer> learners) {
        this.learners = learners;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignmentResponse assignmentResponse = (AssignmentResponse) o;
        return Objects.equals(this.assignmentId, assignmentResponse.assignmentId) &&
                Objects.equals(this.assignmentName, assignmentResponse.assignmentName) &&
                Objects.equals(this.teachers, assignmentResponse.teachers) &&
                Objects.equals(this.learners, assignmentResponse.learners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignmentId, assignmentName, teachers, learners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignmentResponse {\n");

        sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
        sb.append("    assignmentName: ").append(toIndentedString(assignmentName)).append("\n");
        sb.append("    teachers: ").append(toIndentedString(teachers)).append("\n");
        sb.append("    learners: ").append(toIndentedString(learners)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
