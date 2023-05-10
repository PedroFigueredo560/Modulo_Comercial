/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.funcionario.dao;

import br.com.modulocomercial.funcionario.model.Funcionario;
import br.com.modulocomercial.infrastructure.dao.IBaseDAO;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public interface IDaoFuncionario extends IBaseDAO<Funcionario>{

    public abstract List<Funcionario> findByNameFuncionario(String name);
}