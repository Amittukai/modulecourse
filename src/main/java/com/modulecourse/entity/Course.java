package com.modulecourse.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "course")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course{

    @NotNull
    public String courseCode;
    @NotNull
    public String courseName;
    public String courseObjective;
    public String courseNumberSession;

}
