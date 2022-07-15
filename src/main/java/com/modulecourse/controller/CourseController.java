package com.modulecourse.controller;

import com.modulecourse.entitidto.CourseDto;
import com.modulecourse.entitidto.ModuleDto;
import com.modulecourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController extends BaseController{

    @Autowired
    CourseService courseService;

    @GetMapping()
    public ResponseEntity getAllCourse(){return sendSuccesResponse(courseService.getAllCourseService());}

    @PostMapping()
    public ResponseEntity addCourse(@RequestBody CourseDto courseDto){
        return sendSuccesResponse(courseService.addCourseService(courseDto));
    }

    @DeleteMapping
    public  ResponseEntity deleteCourse(@RequestParam String courseCode){
        return sendSuccesResponse(courseService.deleteCourseService(courseCode));
    }
}
