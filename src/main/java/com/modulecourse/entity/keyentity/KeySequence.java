package com.modulecourse.entity.keyentity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@Document(collection = "Key_Sequence")
@MappedSuperclass       ////////
public class KeySequence {

//    @Id
//    public String idName;
//    public long seq;
}
