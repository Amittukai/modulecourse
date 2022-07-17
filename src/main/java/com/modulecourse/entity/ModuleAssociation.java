package com.modulecourse.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document//(collation = "module_association")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModuleAssociation{

    public String id;
    public String courseCode;
    public String moduleCode;
}
