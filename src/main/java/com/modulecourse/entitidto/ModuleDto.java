package com.modulecourse.entitidto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class ModuleDto{

//    @Transient          //This variable does not take part in serialaization i.e. in the time of serialaization
//    //this following variable remains hide or simply it is not the part of the table
//    public static final String SEQUENCE_NAME="user_sequence";   //static i.e. no need  to create object
//    //final i.e. constant
    @Id
    public long moduleDtoId;

    @NotNull
    public String moduleName;
    @NotNull
    public String moduleCode;
    int moduleNumberSession;
    public String moduleObjective;

}
