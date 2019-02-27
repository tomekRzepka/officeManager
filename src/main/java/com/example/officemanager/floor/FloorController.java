package com.example.officemanager.floor;

import com.example.officemanager.internalapi.CrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/floor")
public class FloorController extends CrudController<Floor,FloorRepository,FloorService>{

    @Autowired
    protected void setService(FloorService service) {
        this.service = service;
    }
}
