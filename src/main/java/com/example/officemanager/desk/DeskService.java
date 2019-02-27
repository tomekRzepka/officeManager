package com.example.officemanager.desk;

import com.example.officemanager.internalapi.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeskService extends CrudService<Desk,DeskRepository> {

    @Autowired
    protected void setEntityRepository(DeskRepository entityRepository) {
        this.repository = entityRepository;
    }
}
