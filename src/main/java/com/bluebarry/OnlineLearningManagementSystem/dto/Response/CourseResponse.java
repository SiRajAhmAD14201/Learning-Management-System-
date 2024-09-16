package com.bluebarry.OnlineLearningManagementSystem.dto.Response;

import lombok.Data;

import java.util.List;
@Data
public class CourseResponse {
    private Long id;
    private String title;
    private String description;
    private String difficultyLevel;  // ENUM value as a string (BEGINNER, INTERMEDIATE, ADVANCED)
    private Long instructorId;
    private List<LessonResponseForCourse> lessons;  // List of lessons with detailed info
    private List<ReviewResponseForCourse> reviews;  // List of reviews with detailed info
    private List<StudentResponse> enrolledStudents;  // List of enrolled students
    private CertificateTemplateResponse certificateTemplate;  // Certificate template details
}