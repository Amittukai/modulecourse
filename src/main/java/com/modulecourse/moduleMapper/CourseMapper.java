package com.modulecourse.moduleMapper;

import com.modulecourse.entitidto.CourseDto;
import com.modulecourse.entity.Course;

public class CourseMapper {
    public CourseDto convertToDto(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.setCourseDtoCode(course.getCourseCode());
        courseDto.setCourseDtoName(course.getCourseName());
        courseDto.setCourseDtoObjective(course.getCourseObjective());
        courseDto.setCourseDtoNumberSession(course.getCourseNumberSession());
        return courseDto;
    }
    public Course convertToCourse(CourseDto courseDto){
        Course course = new Course();
        course.setCourseCode(courseDto.getCourseDtoCode());
        course.setCourseName(courseDto.getCourseDtoName());
        course.setCourseObjective(courseDto.getCourseDtoObjective());
        course.setCourseNumberSession(courseDto.getCourseDtoNumberSession());
        return course;
    }
}
