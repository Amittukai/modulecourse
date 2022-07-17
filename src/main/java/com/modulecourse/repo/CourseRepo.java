package com.modulecourse.repo;

import com.modulecourse.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends MongoRepository<Course,String> {

    Course findByCourseCode(String courseCode);
}
