package com.modulecourse.moduleMapper;

import com.modulecourse.entitidto.CourseDto;
import com.modulecourse.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseMapper {
    public Course convertToCourse(CourseDto courseDto){
        Course course = new Course();
        course.setCourseCode(courseDto.getCourseCode());
        course.setCourseName(courseDto.getCourseName());
        course.setCourseNumberSession(courseDto.getCourseNumberSession());
        course.setCourseObjective(courseDto.getCourseObjective());
        return course;
    }
    public CourseDto convertToDto(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.setCourseCode(course.getCourseCode());
        courseDto.setCourseName(course.getCourseName());
        courseDto.setCourseNumberSession(course.getCourseNumberSession());
        courseDto.setCourseObjective(course.getCourseObjective());
        return courseDto;
    }
}
