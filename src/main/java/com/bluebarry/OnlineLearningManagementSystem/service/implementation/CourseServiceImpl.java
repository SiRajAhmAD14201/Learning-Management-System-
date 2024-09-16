package com.bluebarry.OnlineLearningManagementSystem.service.implementation;

import com.bluebarry.OnlineLearningManagementSystem.dto.Request.CourseRequest;
import com.bluebarry.OnlineLearningManagementSystem.dto.Response.CourseResponse;
import com.bluebarry.OnlineLearningManagementSystem.entities.Course;
import com.bluebarry.OnlineLearningManagementSystem.exception.ResourceNotFoundException;
import com.bluebarry.OnlineLearningManagementSystem.repositories.CourseRepo;
import com.bluebarry.OnlineLearningManagementSystem.service.interfaces.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;
    private final ModelMapper modelMapper;
@Autowired
    public CourseServiceImpl(CourseRepo courseRepo, ModelMapper modelMapper) {
        this.courseRepo = courseRepo;
    this.modelMapper = modelMapper;
}

    @Override
    public List<CourseResponse> getAllCourses() {
       List<Course> course=courseRepo.findAll();
        return course.stream().map(course1 -> modelMapper.map(course1,CourseResponse.class)).collect(Collectors.toList());
    }

    @Override
    public CourseResponse getCourseById(Long id) {
        return null;
    }

    @Override
    public CourseRequest saveCourse(CourseRequest courseRequest) {
        return null;
    }

    @Override
    public CourseRequest updateCourse(CourseRequest courseRequest, Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id){
        if (!courseRepo.existsById(id)){
            throw new ResourceNotFoundException("Course not found with id: " + id);
        }
        else{
            courseRepo.deleteById(id);
        }
    }
}
