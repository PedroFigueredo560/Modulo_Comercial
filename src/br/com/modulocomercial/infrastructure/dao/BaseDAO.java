/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.infrastructure.dao;

import br.com.modulocomercial.infrastructure.model.PersistenceEntity;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pedro Henrique
 * @param <Entity>
 */
public class BaseDAO<Entity extends PersistenceEntity> implements IBaseDAO<Entity> {
    
    protected static EntityManager entityManager;
    
    static{
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("ModuloComercial");
        entityManager = fac.createEntityManager();
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Entity save(Entity entity){
       entityManager.getTransaction().begin();
       entityManager.persist(entity);
       entityManager.getTransaction().commit();
       return entity;
        
    }
    
    /**
     * {@inheritDoc}
     * @param entity
     * @return 
     */
    @Override
    public Entity update(Entity entity){
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        return entity;

    }
    
    /**
     * {@inheritDoc}
     * @param entity
     */
    @Override
    public void delete(Entity entity){
       entity = findById(entity.getId());
       entityManager.getTransaction().begin();
       entityManager.remove(entity);
       entityManager.getTransaction().commit();       
    }
    
    /**
     * {@inheritDoc}
     * @return 
     */
    @Override
    public List<Entity> findAll(){
        return entityManager.createQuery(("FROM " + getTypeClass().getName())).getResultList();
    }
    
    
    /**
     * {@inheritDoc}
     * @param id
     * @return 
     */
    @Override
    public Entity findById(Long id){
        return (Entity) entityManager.find(getTypeClass(), id);
    }
    
    public Class<?> getTypeClassEntity(Entity entity){
        Class<?> clazz = entity.getClass();
        return clazz;
    }
    
    protected Class<?> getTypeClass(){
        
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        
        return clazz;
    }
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
