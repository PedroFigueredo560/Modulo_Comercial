/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.venda.service;

import br.com.modulocomercial.infrastructure.exception.BusinessException;
import br.com.modulocomercial.venda.dao.DaoVenda;
import br.com.modulocomercial.venda.dao.IDaoVenda;
import br.com.modulocomercial.venda.model.Venda;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public class ServiceVenda implements IServiceVenda {
    
    
    //Constantes para condições de erro
    
    //Venda Null
    public final static String VENDA_NULL = "Venda null";
    
    //Venda já existe
    public final static String VENDA_EXISTE = "Venda já existe";
    
    //Venda não existente
    public final static String VENDA_NAO_EXISTE = "a Venda não existe na base de dados";
    
    //Venda inválido
    public final static String VENDA_INVALIDO = "Venda inválido";
    
    //Criando objeto de instância
    
    private final IDaoVenda daoVenda = new DaoVenda();

    @Override
    public Venda saveVenda(Venda venda) {
        if(venda == null){
            throw new BusinessException(VENDA_NULL);
        } else if(daoVenda.findById(venda.getId()) != null){
            throw new BusinessException(VENDA_EXISTE);
        } else{
            return daoVenda.save(venda);
        }    }

    @Override
    public Venda updateVenda(Venda venda) {
        if(venda == null){
            throw new BusinessException(VENDA_NULL);
        } else if(daoVenda.findById(venda.getId()) == null){
            throw new BusinessException(VENDA_EXISTE);
        } else{
            return daoVenda.update(venda);
        }    
    }

    @Override
    public void deleteVenda(Venda venda) {
        if(venda == null){
            throw new BusinessException(VENDA_NULL);
        } else if(daoVenda.findById(venda.getId()) != null){
            this.daoVenda.delete(venda);
            return;
        } 
        
        throw new BusinessException(VENDA_NAO_EXISTE);    
    }

    @Override
    public List<Venda> getAllVendas() {
        return daoVenda.findAll();
    }

    @Override
    public List<Venda> findByNameVenda(String name) {
    if(name == null){
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()){
            throw new BusinessException("Nome vazio");
        } else {
            return daoVenda.findByNameVenda(name);
        }
    }
    
    @Override
    public List<Venda> findByClienteVenda(int idCliente) {
        return daoVenda.findByClienteVenda(idCliente);       
    }
    
}
