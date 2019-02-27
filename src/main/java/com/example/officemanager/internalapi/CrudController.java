package com.example.officemanager.internalapi;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CrudController<Entity extends CrudEntity,Repository extends JpaRepository<Entity,Long>,Service extends CrudService<Entity,Repository>> {
}
