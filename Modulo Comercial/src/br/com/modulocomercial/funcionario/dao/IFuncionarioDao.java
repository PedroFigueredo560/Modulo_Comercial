/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.funcionario.dao;

import java.util.List;
import br.com.modulocomercial.infrastructure.dao.IBaseDAO;
import br.com.modulocomercial.funcionario.model.Funcionario;

/**
 *
 * @author Pedro Henrique
 */
public interface IFuncionarioDao extends IBaseDAO<Funcionario> {
     public abstract List<Funcionario> findById(String name);
}
