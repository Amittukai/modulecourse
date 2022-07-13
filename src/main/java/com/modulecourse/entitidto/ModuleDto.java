package com.modulecourse.entitidto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModuleDto{

    @NotNull
    public String moduleName;
    @NotNull
    public String moduleCode;
    int moduleNumberSession;
    public String moduleObjective;

}
