/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.venda.service;

import br.com.modulocomercial.venda.model.Venda;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public interface IServiceVenda {
    
    public abstract Venda saveVenda(Venda venda);
    public abstract Venda updateVenda(Venda venda);
    public abstract void deleteVenda(Venda venda);
    public List<Venda> getAllVendas();
    public List<Venda> findByNameVenda(String name);   
    public List<Venda> findByClienteVenda(int idCliente);
}
