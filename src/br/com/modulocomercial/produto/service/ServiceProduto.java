/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.produto.service;

import br.com.modulocomercial.infrastructure.exception.BusinessException;
import br.com.modulocomercial.produto.dao.DaoProduto;
import br.com.modulocomercial.produto.dao.IDaoProduto;
import br.com.modulocomercial.produto.model.Produto;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public class ServiceProduto implements IServiceProduto{
    //Constantes para condições de erro
    
    //Produto Null 
    public final static String PRODUTO_NULL = "Produto null";
    
    //Produto já existe
    public final static String PRODUTO_EXISTE = "Produto já existe";
    
    //Produto não existente
    public final static String PRODUTO_NAO_EXISTE = "O Produto já existe na base de dados";
    
    //Produto inválido
    public final static String PRODUTO_INVALIDO = "Produto inválido";
    
    //Criando objeto de instância
    
    private final IDaoProduto daoProduto = new DaoProduto();
    
    @Override
    public Produto saveProduto(Produto produto) {
        if(produto == null){
            throw new BusinessException(PRODUTO_NULL);
        } else if(daoProduto.findById(produto.getId()) != null){
            throw new BusinessException(PRODUTO_EXISTE);
        } else{
            return daoProduto.save(produto);
        }
    }

    @Override
    public Produto updateProduto(Produto produto) {
        if(produto == null){
            throw new BusinessException(PRODUTO_NULL);
        } else{
            return daoProduto.update(produto);
        }
    }

    @Override
    public void deleteProduto(Produto produto) {
        if(produto == null){
            throw new BusinessException(PRODUTO_NULL);
        } else if(daoProduto.findById(produto.getId()) != null){
            this.daoProduto.delete(produto);
            return;
        } 
        
        throw new BusinessException(PRODUTO_NAO_EXISTE);
    }

    @Override
    public List<Produto> getAllProdutos() {
        return daoProduto.findAll();
    }

    @Override
    public List<Produto> findByNameProduto(String name) {
        if(name == null){
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()){
            throw new BusinessException("Nome vazio");
        } else {
            return daoProduto.findByNameProduto(name);
        }
    }
    
}
