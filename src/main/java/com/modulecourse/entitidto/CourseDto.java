package com.modulecourse.entitidto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Document(collection="CourseDto") if needed
public class CourseDto {

    public String courseCode;
    public String courseName;
    public String courseNumberSession;
    public String courseObjective;
}
