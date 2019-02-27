package com.example.officemanager.person;

import com.example.officemanager.internalapi.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends CrudService<Person,PersonRepository> {
    @Autowired
    protected void setEntityRepository(PersonRepository entityRepository) {
        this.repository = entityRepository;
    }
}
