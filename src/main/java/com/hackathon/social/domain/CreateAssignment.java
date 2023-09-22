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
 * CreateAssignment
 */
@Validated
public class CreateAssignment {
    @JsonProperty("assignmentName")
    private String assignmentName = null;

    @JsonProperty("teachers")
    @Valid
    private List<Integer> teachers = new ArrayList<Integer>();

    @JsonProperty("learners")
    @Valid
    private List<Integer> learners = new ArrayList<Integer>();

    public CreateAssignment assignmentName(String assignmentName) {
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

    public CreateAssignment teachers(List<Integer> teachers) {
        this.teachers = teachers;
        return this;
    }

    public CreateAssignment addTeachersItem(Integer teachersItem) {
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

    public CreateAssignment learners(List<Integer> learners) {
        this.learners = learners;
        return this;
    }

    public CreateAssignment addLearnersItem(Integer learnersItem) {
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
        CreateAssignment createAssignment = (CreateAssignment) o;
        return Objects.equals(this.assignmentName, createAssignment.assignmentName) &&
                Objects.equals(this.teachers, createAssignment.teachers) &&
                Objects.equals(this.learners, createAssignment.learners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignmentName, teachers, learners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssignment {\n");

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
