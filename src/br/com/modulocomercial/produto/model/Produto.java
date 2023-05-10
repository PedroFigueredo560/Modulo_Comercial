/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.produto.model;

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
public class Produto extends PersistenceEntity implements Serializable{
    //variaveis de produto
    private String name;
    private int cod;
    private float value;
    private int quantidade;
    
    //getterres e setterres 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
