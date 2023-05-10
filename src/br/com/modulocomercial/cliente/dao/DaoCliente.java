/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.cliente.dao;

import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.infrastructure.dao.BaseDAO;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author Pedro Henrique
 */
public class DaoCliente extends BaseDAO<Cliente> implements IDaoCliente{

    @Override
    public List<Cliente> findByNameCliente(String name) {
        String busca = "SELECT a FROM clientes AS a WHERE a nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }
    
}

