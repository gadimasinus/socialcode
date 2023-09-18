package com.hackathon.social.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

enum CourseCategory {
    AI(1),
    Computer(2);

    private final int value;

    CourseCategory(int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }
}

@Data
@NoArgsConstructor
public class Course {

    private int courseId;
    private String courseName;
    private String courseCategory;
    private String courseDescription;

}
