/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.cliente.service;

import br.com.modulocomercial.cliente.model.Cliente;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public interface IServiceCliente {
    public abstract Cliente saveCliente(Cliente cliente);
    public abstract Cliente updateCliente(Cliente cliente);
    public abstract void deleteCliente(Cliente cliente);
    public List<Cliente> getAllClientes();
    public List<Cliente> findByName(String name);
}
