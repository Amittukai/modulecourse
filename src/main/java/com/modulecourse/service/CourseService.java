package com.modulecourse.service;

import com.modulecourse.entitidto.CourseDto;
import com.modulecourse.entity.Course;
import com.modulecourse.repo.CourseRepo;
import com.modulecourse.moduleMapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService extends CourseMapper{

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    CourseRepo courseRepo;

//    @Autowired
//    CourseDto courseDto;

    public List<Course> getAllCourseService(){
        List<Course> courseList = courseRepo.findAll();
        //List<CourseDto> courseDtoList = new ArrayList<>();
        //course.forEach(c-> courseDtoList.add(getCourseDtoWithValues(c)));
        return courseList;
    }
    public CourseDto addCourseService(CourseDto courseDto){
        Course course = courseMapper.convertToCourse(courseDto);
        return courseMapper.convertToDto(courseRepo.save(course));
    }
    public boolean deleteCourseService(String courseCode){
        Course course = courseRepo.findByCourseCode(courseCode);
        courseRepo.delete(course);
        return true;
    }
}
