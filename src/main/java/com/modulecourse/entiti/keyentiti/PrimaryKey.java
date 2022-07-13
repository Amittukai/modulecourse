package com.modulecourse.entiti.keyentiti;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass       ////////
public class PrimaryKey {

    @Id
    @GeneratedValue
    public long id;
}
