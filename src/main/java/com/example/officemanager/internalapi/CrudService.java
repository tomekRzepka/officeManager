package com.example.officemanager.internalapi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class CrudService<Entity extends CrudEntity, Repository extends JpaRepository<Entity,Long>> {

    protected Repository repository;
    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public Long count() {
        return this.getRepository().count();
    }


    public Entity save(Entity entity) {
        return this.getRepository().save(entity);
    }


    public Entity getById(Long id) {
        return this.getRepository().getOne(id);
    }


    public List<Entity> getAll() {
        return this.getRepository().findAll();
    }

    public Long delete(Long id){
        this.getRepository().deleteById(id);
        return id;
    }

}
