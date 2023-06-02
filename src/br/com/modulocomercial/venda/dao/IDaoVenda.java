/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.venda.dao;

import br.com.modulocomercial.venda.model.Venda;
import br.com.modulocomercial.infrastructure.dao.IBaseDAO;
import java.util.List;
/**
 *
 * @author Pedro Henrique
 */
public interface IDaoVenda extends IBaseDAO<Venda>{
    public abstract List<Venda> findByNameVenda(String name);
    public abstract List<Venda> findByClienteVenda(int idCliente);
}
