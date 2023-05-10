/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.produto.service;

import br.com.modulocomercial.produto.model.Produto;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public interface IServiceProduto {
    public abstract Produto saveProduto(Produto produto);
    public abstract Produto updateProduto(Produto produto);
    public abstract void deleteProduto(Produto produto);
    public List<Produto> getAllProdutos();
    public List<Produto> findByNameProduto(String name);
}
