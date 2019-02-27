package com.example.officemanager.desk;

import com.example.officemanager.floor.FloorService;
import com.example.officemanager.internalapi.CrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/desk")
public class DeskController extends CrudController<Desk,DeskRepository,DeskService> {
    @Autowired
    protected void setService(DeskService service) {
        this.service = service;
    }

}
