/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.venda.model;

import br.com.modulocomercial.infrastructure.model.PersistenceEntity;
import br.com.modulocomercial.produto.model.Produto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Table;
import javax.persistence.Entity;  
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
/**
 *
 * @author Pedro Henrique
 */
@Entity
@Table
public class Venda extends PersistenceEntity implements Serializable{
    private String nomeProduto;
    private int quantidade;
    private int codProduto;
    private float valorUnitario;
    private float total;
    private int idCliente;
    private int codVenda;
    private boolean pago;
    
    public boolean isPago() {
        return pago;
    }

    //getterres e setterres ;
    public void setPago(boolean pago) {    
        this.pago = pago;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

   
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
   
    
}
