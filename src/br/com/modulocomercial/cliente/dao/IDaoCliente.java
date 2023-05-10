/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.cliente.dao;

import br.com.modulocomercial.cliente.model.Cliente;
import br.com.modulocomercial.infrastructure.dao.IBaseDAO;
import java.util.List;

/**
 *
 * @author Pedro Henrique
 */

public interface IDaoCliente extends IBaseDAO<Cliente>{
    
    public abstract List<Cliente> findByNameCliente(String name);
}
