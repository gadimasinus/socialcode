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
 * CourseResponse
 */
@Validated
public class CourseResponse {
    @JsonProperty("courseId")
    private Long courseId = null;

    @JsonProperty("courseName")
    private String courseName = null;

    @JsonProperty("category")
    private String category = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("teachers")
    @Valid
    private List<Integer> teachers = new ArrayList<Integer>();

    @JsonProperty("learners")
    @Valid
    private List<Integer> learners = new ArrayList<Integer>();

    public CourseResponse courseId(Long courseId) {
        this.courseId = courseId;
        return this;
    }

    /**
     * Get courseId
     *
     * @return courseId
     **/
    @Schema(example = "10", required = true, description = "")
    @NotNull

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public CourseResponse courseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    /**
     * Get courseName
     *
     * @return courseName
     **/
    @Schema(example = "Some Course", required = true, description = "")
    @NotNull

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    /**
     * Get category
     *
     * @return category
     **/
    @Schema(example = "Course Category", required = true, description = "")
    @NotNull

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CourseResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(example = "Course description", required = true, description = "")
    @NotNull

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CourseResponse teachers(List<Integer> teachers) {
        this.teachers = teachers;
        return this;
    }

    public CourseResponse addTeachersItem(Integer teachersItem) {
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

    public CourseResponse learners(List<Integer> learners) {
        this.learners = learners;
        return this;
    }

    public CourseResponse addLearnersItem(Integer learnersItem) {
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
        CourseResponse courseResponse = (CourseResponse) o;
        return Objects.equals(this.courseId, courseResponse.courseId) &&
                Objects.equals(this.courseName, courseResponse.courseName) &&
                Objects.equals(this.teachers, courseResponse.teachers) &&
                Objects.equals(this.learners, courseResponse.learners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseName, teachers, learners);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CourseResponse {\n");

        sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
        sb.append("    courseName: ").append(toIndentedString(courseName)).append("\n");
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
