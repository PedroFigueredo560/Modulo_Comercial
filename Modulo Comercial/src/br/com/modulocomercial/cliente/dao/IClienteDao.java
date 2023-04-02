/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.modulocomercial.cliente.dao;

import java.util.List;
import br.com.modulocomercial.infrastructure.dao.IBaseDAO;
import br.com.modulocomercial.cliente.model.Cliente;

/**
 *
 * @author Victor
 */
public interface IClienteDao extends IBaseDAO<Cliente> {
     public abstract List<Cliente> findById(String name);
}
