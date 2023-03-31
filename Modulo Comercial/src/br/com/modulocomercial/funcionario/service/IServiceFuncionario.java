/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.funcionario.service;
import br.com.modulocomercial.funcionario.model.Funcionario;
import java.util.List;
/**
 *
 * @author Pedro Henrique
 */
public interface IServiceFuncionario {
    public abstract Funcionario saveFuncionario(Funcionario funcionario);
    public abstract Funcionario updateFuncionario(Funcionario funcionario);
    public abstract void deleteFuncionario(Funcionario funcionario);
    public abstract List<Funcionario> getAllFuncionarios();
    public List<Funcionario> findById(String name);
}
