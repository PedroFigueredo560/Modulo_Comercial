/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.infrastructure.service;
import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.cliente.service.IServiceCliente;
import br.com.modulocomercial.cliente.service.ServiceCliente;
import br.com.modulocomercial.funcionario.service.IServiceFuncionario;
import br.com.modulocomercial.funcionario.service.ServiceFuncionario;
import br.com.modulocomercial.funcionario.model.Funcionario;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public class Facade implements IFacade {
    
    //////cliente
    private final IServiceCliente serviceCliente = new ServiceCliente();

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return serviceCliente.saveCliente(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return serviceCliente.updateCliente(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        this.serviceCliente.deleteCliente(cliente);
    }

    @Override
    public List<Cliente> getAllClientes() {
        return serviceCliente.getAllClientes();
    }

    @Override
    public List<Cliente> findByNameCliente(String name) {
        return serviceCliente.findByName(name);
    }
    
    //////funcionario
    private final IServiceFuncionario serviceFuncionario = new ServiceFuncionario();

    @Override
    public Funcionario saveFuncionario(Funcionario funcionario) {
        return serviceFuncionario.saveFuncionario(funcionario);
    }

    @Override
    public Funcionario updateFuncionario(Funcionario funcionario) {
        return serviceFuncionario.updateFuncionario(funcionario);
    }

    @Override
    public void deleteFuncionario(Funcionario funcionario) {
        this.serviceFuncionario.deleteFuncionario(funcionario);
    }

    @Override
    public List<Funcionario> getAllFuncionarios() {
        return serviceFuncionario.getAllFuncionarios();
    }

    @Override
    public List<Funcionario> findByNameFuncionario(String name) {
        return serviceFuncionario.findByNameFuncionario(name);
    }
}
