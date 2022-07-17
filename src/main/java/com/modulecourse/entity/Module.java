package com.modulecourse.entity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "module")        //Create a collection or table named "module" otherwise the collection name
                                        //will be as same as the class name in this case "Module" in Mongodb
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Module {

//    @Transient          //This variable does not take part in serialaization i.e. in the time of serialaization
//                        //this following variable remains hide or simply it is not the part of the table
//    public static final String SEQUENCE_NAME="user_sequence";   //static i.e. no need  to create object
                                                                //final i.e. constant
//    public long moduleId;
    @Id
    @NotNull
    public String moduleCode;
    @NotNull
    public String moduleName;
    int moduleNumberSession;
    public String moduleObjective;

}
