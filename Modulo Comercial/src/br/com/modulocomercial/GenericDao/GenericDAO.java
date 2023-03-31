/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.GenericDAO;

import br.com.modulocomercial.AbstractEntity;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author ph715
 * @param <T>
 */
@SuppressWarnings("Unchecked")
public class GenericDAO<T extends AbstractEntity> implements IGenericDAO<Entity> {
    protected static EntityManager entityManager;
    //criando manager
    static{
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory("tarefas");
        entityManager = factory.createEntityManager();
    }
    //encontrando o objeto pela ID
    public T getById(long id){
        return (T) entityManager.find(getTypeClass(), id);
    }
    //Salvar no BD
    public void save(T entity){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    //Editar no BD
    public void update(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    //Deletar do BD
    public void delete(T entity) {
        try {
            entity = getById(entity.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    //Retornar lista de objetos no BD
    public List<T> findAll() {
        return entityManager.createQuery(("From " + getTypeClass().getName())).getResultList();
    }
    //Pegando o tipo de classe
    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

        return clazz;
    }
}
