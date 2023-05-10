/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.produto.dao;

import br.com.modulocomercial.infrastructure.dao.IBaseDAO;
import br.com.modulocomercial.produto.model.Produto;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public interface IDaoProduto extends IBaseDAO<Produto>{
     public abstract List<Produto> findByNameProduto(String name);
}
