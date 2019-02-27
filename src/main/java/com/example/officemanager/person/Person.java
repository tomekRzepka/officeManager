package com.example.officemanager.person;

import com.example.officemanager.internalapi.CrudEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person extends CrudEntity {

    private String name;
    private String role;
}
