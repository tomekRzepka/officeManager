package com.example.officemanager.floor;

import com.example.officemanager.internalapi.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FloorService extends CrudService<Floor,FloorRepository> {
    @Autowired
    protected void setEntityRepository(FloorRepository entityRepository) {
        this.repository = entityRepository;
    }
}
