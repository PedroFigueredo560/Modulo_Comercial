/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.produto.dao;

import br.com.modulocomercial.infrastructure.dao.BaseDAO;
import br.com.modulocomercial.produto.model.Produto;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Pedro Henrique
 */
public class DaoProduto extends BaseDAO<Produto> implements IDaoProduto{
     @Override
    public List<Produto> findByNameProduto(String name) {
        String busca = "SELECT a FROM Produto AS a WHERE a.name=:name";
        Query query = entityManager.createQuery(busca);
        query.setParameter("name", name);
        return query.getResultList();
    }
    
}
