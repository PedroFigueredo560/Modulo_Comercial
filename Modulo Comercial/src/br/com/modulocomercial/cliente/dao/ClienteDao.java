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

public class ClienteDao {
    
    public class FuncionarioDao extends BaseDAO<Cliente> implements IClienteDao {
     
    @Override
    public List<Cliente> findById(String name) {
      String busca = "SELECT a FROM Usuario AS a WHERE a.nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
        
        }
    }     
}
