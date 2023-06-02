/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.venda.dao;

import br.com.modulocomercial.infrastructure.dao.BaseDAO;
import br.com.modulocomercial.venda.model.Venda;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Pedro Henrique
 */
public class DaoVenda extends BaseDAO<Venda> implements IDaoVenda{

    @Override
    public List<Venda> findByNameVenda(String name) {
        String busca = "SELECT a FROM Venda AS a WHERE a nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }
   
    
    @Override
    public List<Venda> findByClienteVenda(int idCliente){
        String busca = "SELECT v FROM Venda v WHERE v.idCliente = :idCliente";
        Query query = entityManager.createQuery(busca);
        query.setParameter("idCliente", idCliente);
        return query.getResultList();
    }
}
