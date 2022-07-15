package com.modulecourse.moduleMapper;

import com.modulecourse.entitidto.CourseDto;
import com.modulecourse.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;

public class CourseMapper {
    public Course convertToCourse(CourseDto courseDto){
        Course course = new Course();
        course.setCourseCode(courseDto.getCourseDtoCode());
        course.setCourseName(courseDto.getCourseDtoName());
        course.setCourseObjective(courseDto.getCourseDtoObjective());
        course.setCourseNumberSession(courseDto.getCourseDtoNumberSession());
        return course;
    }
    public CourseDto convertToDto(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.setCourseDtoCode(course.getCourseCode());
        courseDto.setCourseDtoName(course.getCourseName());
        courseDto.setCourseDtoObjective(course.getCourseObjective());
        courseDto.setCourseDtoNumberSession(course.getCourseNumberSession());
        return courseDto;
    }
}
