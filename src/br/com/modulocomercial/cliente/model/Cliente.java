/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.cliente.model;

import br.com.modulocomercial.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Entity;  
/**
 *
 * @author Pedro Henrique
 */
@Entity
@Table
public class Cliente extends PersistenceEntity implements Serializable{
    //variaveis de cliente
    private String email;
    private String nome;
    private String username;
    private String login;
    private String senha;

    //getterres e setterres
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     public String getUserNome() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
