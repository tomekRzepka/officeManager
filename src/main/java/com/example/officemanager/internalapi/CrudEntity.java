package com.example.officemanager.internalapi;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class CrudEntity {


    @Id
    @GeneratedValue
    private Long id;


}
