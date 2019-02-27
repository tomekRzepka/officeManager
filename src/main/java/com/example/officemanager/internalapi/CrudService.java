package com.example.officemanager.internalapi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class CrudService<Entity extends CrudEntity, Repository extends JpaRepository<Entity,Long>> {

    protected Repository repository;


    public Long count() {
        return repository.count();
    }


    public Entity save(Entity entity) {
        return repository.save(entity);
    }


    public Entity getById(Long id) {
        return repository.getOne(id);
    }


    public List<Entity> getAll() {
        return repository.findAll();
    }

}
