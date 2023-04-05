/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.cliente.service;

import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.exception.BusinessException;        
import br.com.modulocomercial.cliente.dao.ClienteDao;
import br.com.modulocomercial.infrastructure.dao.IBaseDAO;
import br.com.modulocomercial.cliente.dao.IClienteDao;
import java.util.List;

/**
 *
 * @author Victor
 */

public class ServiceCliente implements IServiceCliente {
    //CONSTANTES
    
    //mensagem de erro se o Usuario for null;
    public final static String CLIENTE_NULL = "Cliente null";
    
    //mensagem de erro se o Usuario já existir;
    public final static String CLIENTE_EXISTE = "O Cliente já existe,";
    
    //mensagem de erro se o Usuario não existir no banco;
    public final static String CLIENTE_NAO_EXISTE = "O Cliente não existe na base de dados";
    
    //mensagem de erro se o Usuario for inválido;
    public final static String CLIENTE_INVALIDO = "Cliente inválido";
    
    //OBJETO
    
    private final IClienteDao daoCliente = (IClienteDao) new ClienteDao();
        

    @Override
    public Cliente saveCliente(Cliente cliente) {
        if(cliente == null){
            throw new BusinessException(CLIENTE_NULL);
        } else if(daoCliente.findById(cliente.getId()) != null){
            throw new BusinessException(CLIENTE_EXISTE);
        } else {
            return daoCliente.save(cliente);
        }
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        if(cliente == null){
            throw new BusinessException(CLIENTE_NULL);
        } else if(daoCliente.findById(cliente.getId()) == null) {
            throw new BusinessException(CLIENTE_EXISTE);
        } else {
            return daoCliente.update(cliente);
        }    
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        if(cliente == null){
            throw new BusinessException(CLIENTE_NULL);
        }else if(this.daoCliente.findById(cliente.getId()) != null) {
            this.daoCliente.delete(cliente);
            return;
        }
            throw new BusinessException(CLIENTE_NAO_EXISTE);    
}

    public List<Cliente> getAllCliente() {
        return this.daoCliente.findAll();    
    }

    @Override
    public List<Cliente> findById(String name) {
        if(name == null) {
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return daoCliente.findById(name);
        }    
    }

    @Override
    public List<Cliente> getAllClientes() {
    return this.daoCliente.findAll();  
    }
}

