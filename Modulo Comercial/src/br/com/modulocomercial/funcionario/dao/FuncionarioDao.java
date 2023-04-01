/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.funcionario.dao;

import br.com.modulocomercial.infrastructure.dao.BaseDAO;
import br.com.modulocomercial.funcionario.model.Funcionario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Pedro Henrique
 */
public class FuncionarioDao extends BaseDAO<Funcionario> implements IFuncionarioDao {
     
    @Override
    public List<Funcionario> findById(String name) {
      String busca = "SELECT a FROM Usuario AS a WHERE a.nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }

} 