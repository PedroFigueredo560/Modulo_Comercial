/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.infrastructure.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Pedro Henrique
 */
@MappedSuperclass
public class PersistenceEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
        
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}