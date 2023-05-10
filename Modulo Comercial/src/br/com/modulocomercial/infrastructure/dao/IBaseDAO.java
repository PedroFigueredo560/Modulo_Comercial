/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.infrastructure.dao;

import br.com.modulocomercial.infrastructure.model.PersistenceEntity;
import java.util.List;
/**
 *
 * @author Pedro Henrique
 * @param <Entity>
 */
public interface IBaseDAO <Entity extends PersistenceEntity> {
    
    /**
     * Salva uma instância de uma entidade persistente no banco de dados.
     * 
     * @param obj a instância que é inserida
     * @return a entidade
     */
    Entity save(Entity obj);

    /**
     * Update an instance of the persistent entity in the system database.
     * 
     * @param obj the instance that is updated
     * @return the entity
     */
    Entity update(Entity obj);

    /**
     * Remove an instance of the persistent entity in the system database.
     * 
     * @param obj the instance that is updated
     */
    void delete(Entity obj);

    /**
     * Retrieve all instances of the entity in the database.
     * 
     * @return a {@link List} with the results.
     */
    List<Entity> findAll();
    
    /**
     * Find an entity by primary key.
     * 
     * @param id
     * @return the entity.
     */
    Entity findById(Long id);
}
