package com.bluebarry.OnlineLearningManagementSystem.dto.Response;

import lombok.Data;

@Data
public class LessonResponseForCourse {
    private Long id;
    private String title;
    private String content;
    private Long courseId;
}
