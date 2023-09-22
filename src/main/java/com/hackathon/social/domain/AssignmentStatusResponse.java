package com.hackathon.social.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AssignmentStatusResponse
 */
@Validated
public class AssignmentStatusResponse {
    @JsonProperty("assignmentId")
    private Long assignmentId = null;

    @JsonProperty("assignmentName")
    private String assignmentName = null;

    @JsonProperty("teacher")
    private Long teacher = null;

    @JsonProperty("learner")
    private Long learner = null;

    @JsonProperty("status")
    private String status = null;

    public AssignmentStatusResponse assignmentId(Long assignmentId) {
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

    public AssignmentStatusResponse assignmentName(String assignmentName) {
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

    public AssignmentStatusResponse teacher(Long teacher) {
        this.teacher = teacher;
        return this;
    }

    /**
     * Get teacher
     *
     * @return teacher
     **/
    @Schema(example = "10", required = true, description = "")
    @NotNull

    public Long getTeacher() {
        return teacher;
    }

    public void setTeacher(Long teacher) {
        this.teacher = teacher;
    }

    public AssignmentStatusResponse learner(Long learner) {
        this.learner = learner;
        return this;
    }

    /**
     * Get learner
     *
     * @return learner
     **/
    @Schema(example = "10", required = true, description = "")
    @NotNull

    public Long getLearner() {
        return learner;
    }

    public void setLearner(Long learner) {
        this.learner = learner;
    }

    public AssignmentStatusResponse status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(example = "ASSIGNED | SUBMITTED | EVALUATED | REJECTED", required = true, description = "")
    @NotNull

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignmentStatusResponse assignmentStatusResponse = (AssignmentStatusResponse) o;
        return Objects.equals(this.assignmentId, assignmentStatusResponse.assignmentId) &&
                Objects.equals(this.assignmentName, assignmentStatusResponse.assignmentName) &&
                Objects.equals(this.teacher, assignmentStatusResponse.teacher) &&
                Objects.equals(this.learner, assignmentStatusResponse.learner) &&
                Objects.equals(this.status, assignmentStatusResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignmentId, assignmentName, teacher, learner, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignmentStatusResponse {\n");

        sb.append("    assignmentId: ").append(toIndentedString(assignmentId)).append("\n");
        sb.append("    assignmentName: ").append(toIndentedString(assignmentName)).append("\n");
        sb.append("    teacher: ").append(toIndentedString(teacher)).append("\n");
        sb.append("    learner: ").append(toIndentedString(learner)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
