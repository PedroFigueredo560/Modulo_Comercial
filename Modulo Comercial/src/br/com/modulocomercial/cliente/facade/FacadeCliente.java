/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.cliente.facade;

import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.cliente.service.IServiceCliente;
import br.com.modulocomercial.cliente.service.ServiceCliente;
import java.util.List;

/**
 *
 * @author Victor
 */
public class FacadeCliente implements IFacadeCliente{

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
    public List<Cliente> getAllCliente() {
        return serviceCliente.getAllClientes();
    }

    @Override
    public List<Cliente> findById(String name) {
        return serviceCliente.findById(name);
    }

    
    
}

