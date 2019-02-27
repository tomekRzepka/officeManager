package com.example.officemanager.person;

import com.example.officemanager.floor.FloorService;
import com.example.officemanager.internalapi.CrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person/")
public class PersonController extends CrudController<Person,PersonRepository,PersonService>{

    @Autowired
    protected void setService(PersonService service) {
        this.service = service;
    }

}
