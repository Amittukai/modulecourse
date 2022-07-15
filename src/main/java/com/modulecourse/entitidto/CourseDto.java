package com.modulecourse.entitidto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Document(collection="CourseDto") if needed
public class CourseDto {
    @NotNull
    public String courseDtoCode;
    @NotNull
    public String courseDtoName;
    public String courseDtoObjective;
    public String courseDtoNumberSession;
}
