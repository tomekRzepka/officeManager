package com.example.officemanager.internalapi;

import io.swagger.annotations.ApiOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CrudController<Entity extends CrudEntity, Repository extends JpaRepository<Entity, Long>, Service extends CrudService<Entity, Repository>> {


    protected Service service;
    protected Service getService() {
        return service;
    }

    protected abstract void setService(Service service);

    @RequestMapping(value = "addItem", method = RequestMethod.POST)
    @ApiOperation(value = "addItem", notes = "Adds a dictionary item")
    public ResponseEntity<Entity> addItem(@RequestBody Entity value) {

        return new ResponseEntity<>(this.getService().save(value), HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<Entity> updateItem(@RequestBody Entity entity) {
            return new ResponseEntity<>(this.getService().save(entity), HttpStatus.OK);

    }

    @GetMapping()
    @ApiOperation(value = "get all", notes = "gets entities")
    public ResponseEntity<List<Entity>> getAll() {
        return new ResponseEntity<>(this.getService().getAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping()
    public ResponseEntity<Object> deleteItem(@RequestBody Long id) {

            return new ResponseEntity<>(this.getService().delete(id), HttpStatus.OK);
    }

    @GetMapping(value = "/count")
    public ResponseEntity<Long> count() {
        Long len = this.getService().count();
        return new ResponseEntity<>(len, HttpStatus.OK);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Entity> get(@PathVariable(value = "id" ,required = false) Long id) {
        return new ResponseEntity<>(this.getService().getById(id), HttpStatus.OK);
    }
}
