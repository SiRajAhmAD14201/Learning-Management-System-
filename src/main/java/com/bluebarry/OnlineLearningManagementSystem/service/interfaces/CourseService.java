package com.bluebarry.OnlineLearningManagementSystem.service.interfaces;

import com.bluebarry.OnlineLearningManagementSystem.dto.Request.CourseRequest;
import com.bluebarry.OnlineLearningManagementSystem.dto.Response.CourseResponse;
import com.bluebarry.OnlineLearningManagementSystem.exception.ResourceNotFoundException;

import java.util.List;

public interface CourseService {
     List<CourseResponse> getAllCourses();
     CourseResponse getCourseById(Long id);
     CourseRequest saveCourse(CourseRequest courseRequest);

     CourseRequest updateCourse(CourseRequest courseRequest, Long id);

     void deleteById(Long id);
}
