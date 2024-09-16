package com.bluebarry.OnlineLearningManagementSystem.controller;

import com.bluebarry.OnlineLearningManagementSystem.dto.Request.CourseRequest;
import com.bluebarry.OnlineLearningManagementSystem.dto.Response.CourseResponse;
import com.bluebarry.OnlineLearningManagementSystem.entities.Course;
import com.bluebarry.OnlineLearningManagementSystem.service.interfaces.CourseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
@Tag(name = "Course Management System", description = "Operations to Course Course Management System")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @Operation(summary = "View a list of available  Courses", description = "Fetches all Courses from the database", responses = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Successfully retrieved list")
    })
    public ResponseEntity<List<CourseResponse>> getAllCourses(){
        List<CourseResponse> courses=courseService.getAllCourses();
        return new ResponseEntity<>(courses,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseResponse> getCourseById( @Parameter(description = "Course Id to fetch the course from database", required = true)
                                                             @PathVariable Long id){
        CourseResponse courseResponse=courseService.getCourseById(id);
       return new ResponseEntity<>(courseResponse,HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<CourseRequest> saveCourse( @Parameter(description = "Course object to store in the database", required = true)
                                                         @RequestBody CourseRequest courseRequest){
        CourseRequest courseRequest1=courseService.saveCourse(courseRequest);
        return new ResponseEntity<>(courseRequest1,HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<CourseRequest> updateCourse(@Parameter(description = "Course object to update in the database", required = true)
                                                          @RequestBody CourseRequest courseRequest,
                                                      @Parameter(description="Course Id to update the course in database")@PathVariable Long id) {
        CourseRequest courseRequest1 = courseService.updateCourse(courseRequest, id);
        if (courseRequest1 != null) {
            return new ResponseEntity<>(courseRequest1, HttpStatus.OK);
        } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id){
        courseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
