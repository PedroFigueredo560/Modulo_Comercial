/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.cliente.model;

import br.com.modulocomercial.infrastructure.model.PersistenceEntity;
import javax.persistence.Table;
import javax.persistence.Entity;       
import javax.persistence.Id;

/**
 *
 * @author Victor
 */

@Entity
@Table
public class Cliente extends PersistenceEntity{
    
    //Variáveis
    
    private String cpf;
    private String nome;
    private String usuario;
    private String senha;
    private String cargo;
    
    
     //Geterres e Setterres
    
    public String getCpf() {
        return cpf;
    }
 public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
    public String getNome() {
        return nome;
    }
     public void setNome(String nome) {
        this.nome = nome;
    }

     
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
    public String getSenha() {
        return senha;  
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public String getCargo() {
        return cargo;    
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
           
    //Id
    
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
        
}