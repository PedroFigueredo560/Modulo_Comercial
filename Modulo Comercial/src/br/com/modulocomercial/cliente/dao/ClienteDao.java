/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.cliente.dao;

import br.com.modulocomercial.infrastructure.dao.BaseDAO;
import br.com.modulocomercial.cliente.model.Cliente;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author Victor
 */    
public class ClienteDao extends BaseDAO<Cliente> implements IClienteDao {
     
    @Override
    public List<Cliente> findById(String id) {
      String busca = "SELECT a FROM Cliente AS a WHERE a.id=:id";
        Query query = entityManager.createQuery(busca);
        query.setParameter("id", id);
        return query.getResultList();
        
    }
}     
