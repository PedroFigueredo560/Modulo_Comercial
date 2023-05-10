/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.funcionario.facade;

import br.com.modulocomercial.funcionario.model.Funcionario;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public interface IFacadeFuncionario {
    
    public abstract Funcionario saveFuncionario(Funcionario funcionario);

    public abstract Funcionario updateFuncionario(Funcionario funcionario);

    public abstract void deleteFuncionario  (Funcionario funcionario);

    public List<Funcionario> getAllFuncionario();

    public List<Funcionario> findById(String name);
}
