package br.com.modulocomercial.AbstractEntity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 import javax.persistence.GeneratedValue;
 import javax.persistence.Id;
 import javax.persistence.MappedSuperclass;
 
 /**
  *
  * @author ph715
 */
 
 @MappedSuperclass
 public class AbstractEntity {
     //ID das entidades
     private long id;
     @Id 
     @GeneratedValue
     public long getId() {
         return id;
     }
 
     public void setId(long id) {
         this.id = id;
     }
 }
 