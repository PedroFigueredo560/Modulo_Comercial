/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.infrastructure.service;

import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.funcionario.model.Funcionario;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public interface IFacade {
    //cliente
    public abstract Cliente saveCliente(Cliente cliente);
    public abstract Cliente updateCliente(Cliente cliente);
    public abstract void deleteCliente(Cliente cliente);
    public abstract List<Cliente> getAllClientes();
    public List<Cliente> findByNameCliente(String name);
    
    //funcionario
    public abstract Funcionario saveFuncionario(Funcionario funcionario);
    public abstract Funcionario updateFuncionario(Funcionario funcionario);
    public abstract void deleteFuncionario(Funcionario funcionario);
    public abstract List<Funcionario> getAllFuncionarios();
    public List<Funcionario> findByNameFuncionario(String name);
}
