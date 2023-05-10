/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.cliente.service;

import br.com.modulocomercial.cliente.dao.DaoCliente;
import br.com.modulocomercial.cliente.dao.IDaoCliente;
import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public class ServiceCliente implements IServiceCliente{
    
    //Constantes para condições de erro
    
    //Cliente Null
    public final static String CLIENTE_NULL = "Cliente null";
    
    //Cliente já existe
    public final static String CLIENTE_EXISTE = "Cliente já existe";
    
    //Cliente não existente
    public final static String CLIENTE_NAO_EXISTE = "O Cliente já existe na base de dados";
    
    //Cliente inválido
    public final static String CLIENTE_INVALIDO = "Cliente inválido";
    
    //Criando objeto de instância
    
    private final IDaoCliente daoCliente = new DaoCliente();
    
    @Override
    public Cliente saveCliente(Cliente clinte) {
        if(clinte == null){
            throw new BusinessException(CLIENTE_NULL);
        } else if(daoCliente.findById(clinte.getId()) != null){
            throw new BusinessException(CLIENTE_EXISTE);
        } else{
            return daoCliente.save(clinte);
        }
    }

    @Override
    public Cliente updateCliente(Cliente clinte) {
        if(clinte == null){
            throw new BusinessException(CLIENTE_NULL);
        } else if(daoCliente.findById(clinte.getId()) == null){
            throw new BusinessException(CLIENTE_EXISTE);
        } else{
            return daoCliente.update(clinte);
        }
    }

    @Override
    public void deleteCliente(Cliente clinte) {
        if(clinte == null){
            throw new BusinessException(CLIENTE_NULL);
        } else if(daoCliente.findById(clinte.getId()) != null){
            this.daoCliente.delete(clinte);
            return;
        } 
        
        throw new BusinessException(CLIENTE_NAO_EXISTE);
    }

    @Override
    public List<Cliente> getAllClientes() {
        return daoCliente.findAll();
    }

    @Override
    public List<Cliente> findByName(String name) {
        if(name == null){
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()){
            throw new BusinessException("Nome vazio");
        } else {
            return daoCliente.findByNameCliente(name);
        }
    }
    
}
