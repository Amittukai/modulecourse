package com.modulecourse.entiti;
import com.modulecourse.entiti.keyentiti.PrimaryKey;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Module extends PrimaryKey {
    @NotNull
    public String moduleName;
    @NotNull
    public String moduleCode;
    int moduleNumberSession;
    public String moduleObjective;

}
