package com.bluebarry.OnlineLearningManagementSystem.dto.Response;

import lombok.Data;

@Data
public class ReviewResponseForCourse {
    private Long id;
    private Double rating;
    private String comment;
    private Long studentId;
    private Long courseId;

}
