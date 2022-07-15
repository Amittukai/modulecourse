package com.modulecourse.controller;

import com.modulecourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController extends BaseController{

    @Autowired
    CourseService courseService;

    @GetMapping
    public ResponseEntity getAllCourse(){return sendSuccesResponse(courseService.getAllCourseService());}
}
