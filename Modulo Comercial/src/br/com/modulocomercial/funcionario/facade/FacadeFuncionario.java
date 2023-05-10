/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.funcionario.facade;

import java.util.List;
import br.com.modulocomercial.funcionario.model.Funcionario;
import br.com.modulocomercial.funcionario.service.IServiceFuncionario;
import br.com.modulocomercial.funcionario.service.ServiceFuncionario;




/**
 *
 * @author ph715
 */
public class FacadeFuncionario implements IFacadeFuncionario{

    private final IServiceFuncionario serviceFuncionario = new ServiceFuncionario();


    @Override
    public Funcionario saveFuncionario(Funcionario funcionario) {
        return serviceFuncionario.saveFuncionario(funcionario);
    }

    @Override
    public Funcionario updateFuncionario(Funcionario funcionario) {
        return serviceFuncionario.updateFuncionario(funcionario);
    }

    @Override
    public void deleteFuncionario(Funcionario funcionario) {
        this.serviceFuncionario.deleteFuncionario(funcionario);
    }

    @Override
    public List<Funcionario> getAllFuncionario() {
        return serviceFuncionario.getAllFuncionarios();
    }

    @Override
    public List<Funcionario> findById(String name) {
        return serviceFuncionario.findById(name);
    }

    
    
}
