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
 * UpdateAssignment
 */
@Validated
public class UpdateAssignment {
    @JsonProperty("assignmentId")
    private Long assignmentId = null;

    @JsonProperty("teachers")
    @Valid
    private List<Integer> teachers = new ArrayList<Integer>();

    @JsonProperty("learners")
    @Valid
    private List<Integer> learners = new ArrayList<Integer>();

    public UpdateAssignment assignmentId(Long assignmentId) {
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

    public UpdateAssignment teachers(List<Integer> teachers) {
        this.teachers = teachers;
        return this;
    }

    public UpdateAssignment addTeachersItem(Integer teachersItem) {
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

    public UpdateAssignment learners(List<Integer> learners) {
        this.learners = learners;
        return this;
    }

    public UpdateAssignment addLearnersItem(Integer learnersItem) {
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
        UpdateAssignment updateAssignment = (UpdateAssignment) o;
        return Objects.equals(this.assignmentId, updateAssignment.assignmentId) &&
                Objects.equals(this.teachers, updateAssignment.teachers) &&
                Objects.equals(this.learners, updateAssignment.learners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignmentId, teachers, learners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssignment {\n");

        sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
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
