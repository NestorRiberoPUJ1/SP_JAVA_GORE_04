package com.principal.repaso.services;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseService {

    //Método abstracto para buscar todos los registros
    public abstract Object findAll();

    //Método abstracto para buscar un registro por id
    public abstract Object findById(Long id);

    //Método abstracto para crear un registro
    public abstract Object create(Object object);

    //Método abstracto para actualizar un registro
    public abstract Object update(Object object);

    //Método abstracto para eliminar un registro
    public abstract void deleteById(Long id);

}
