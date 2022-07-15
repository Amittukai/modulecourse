package com.modulecourse.repo;

import com.modulecourse.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CourseRepo extends MongoRepository<Course,String> {

    List<Course> findByCourseCode(String courseCode);
}
