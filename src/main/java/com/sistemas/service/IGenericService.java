package com.sistemas.service;

import java.util.List;

public interface IGenericService<Entity, ID> {

    public Entity create(Entity entidad);

    public List<Entity> listAll();

    public Entity search(ID id);

    public Entity update(Entity entidad);

    public void delete(ID id);

}
