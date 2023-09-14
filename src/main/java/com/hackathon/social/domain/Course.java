package com.hackathon.social.domain;

 enum CourseCategoty
 {
    AI(1),
    Computer(2);

    private final int value;

	 CourseCategoty(int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }
}
 
public class Course {
	private int courseId;
	private String courseName;
	private String courseCategoty;
	private String courseDescription;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCategoty() {
		return courseCategoty;
	}

	public void setCourseCategoty(String courseCategoty) {
		this.courseCategoty = courseCategoty;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseCategoty=" + courseCategoty
				+ ", courseDescription=" + courseDescription + "]";
	}
	
	

}
