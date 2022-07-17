package com.modulecourse.entitidto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class ModuleAssociationDto {
    @Id
    @NotNull
    public String id;
    @NotNull
    public String courseCode;
    @NotNull
    public String moduleCode;
}
