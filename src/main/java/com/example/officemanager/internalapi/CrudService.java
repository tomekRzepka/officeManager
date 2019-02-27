package com.example.officemanager.internalapi;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class CrudService<Entity extends CrudEntity, Repository extends JpaRepository<Entity,Long>> {
}
