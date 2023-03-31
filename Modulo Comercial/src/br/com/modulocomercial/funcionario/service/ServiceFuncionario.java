/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.funcionario.service;

import br.com.modulocomercial.funcionario.model.Funcionario;
import br.com.modulocomercial.exception.BusinessException;        
import br.com.modulocomercial.funcionario.dao.FuncionarioDao;
import br.com.modulocomercial.GenericDao.IGenericDAO;
import br.com.modulocomercial.funcionario.dao.IFuncionarioDao;
import java.util.List;

/**
 *
 * @author ph715
 */
public class ServiceFuncionario implements IServiceFuncionario {
    //CONSTANTES
    
    //mensagem de erro se o Usuario for null;
    public final static String FUNCIONARIO_NULL = "Funcionario null";
    
    //mensagem de erro se o Usuario já existir;
    public final static String FUNCIONARIO_EXISTE = "O Funcionario já existe,";
    
    //mensagem de erro se o Usuario não existir no banco;
    public final static String FUNCIONARIO_NAO_EXISTE = "O Funcionario não existe na base de dados";
    
    //mensagem de erro se o Usuario for inválido;
    public final static String FUNCIONARIO_INVALIDO = "Funcionario inválido";
    
    //OBJETO
    
    private final IFuncionarioDao daoFuncionario = new FuncionarioDao();
        

    @Override
    public Funcionario saveFuncionario(Funcionario funcionario) {
        if(funcionario == null){
            throw new BusinessException(FUNCIONARIO_NULL);
        } else if(daoFuncionario.findById(funcionario.getId()) != null){
            throw new BusinessException(FUNCIONARIO_EXISTE);
        } else {
            return daoFuncionario.save(funcionario);
        }
    }

    @Override
    public Funcionario updateFuncionario(Funcionario funcionario) {
        if(funcionario == null){
            throw new BusinessException(FUNCIONARIO_NULL);
        } else if(daoFuncionario.findById(funcionario.getId()) == null) {
            throw new BusinessException(FUNCIONARIO_EXISTE);
        } else {
            return daoFuncionario.update(funcionario);
        }    
    }

    @Override
    public void deleteFuncionario(Funcionario funcionario) {
        if(funcionario == null){
            throw new BusinessException(FUNCIONARIO_NULL);
        }else if(this.daoFuncionario.findById(funcionario.getId()) != null) {
            this.daoFuncionario.delete(funcionario);
            return;
        }
            throw new BusinessException(FUNCIONARIO_NAO_EXISTE);    
}

    @Override
    public List<Funcionario> getAllFuncionarios() {
        return this.daoFuncionario.findAll();    
    }

    @Override
    public List<Funcionario> findById(String name) {
        if(name == null) {
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return daoFuncionario.findById(name);
        }    
    }
}
