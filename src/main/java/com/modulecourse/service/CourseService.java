package com.modulecourse.service;

import com.modulecourse.entity.Course;
import com.modulecourse.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseService {

    @Autowired
    CourseRepo courseRepo;
    public List<Course> getAllCourseService(){
        List<Course> courseList = courseRepo.findAll();
        return courseList;
    }
}
