/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.cliente.facade;

/**
 *
 * @author Pedro Henrique
 */
public class FacadeInstanceCliente {

    //o singleton da classe
    
    private static IFacadeCliente fachadaInstance;

    
    //objeto monitor
    
    private static final Object MONITOR = new Object();

    
    //cria uma nova instancia
     
    public FacadeInstanceCliente() {
        super();
    }
    

    public static IFacadeCliente getInstance() {
        synchronized (MONITOR) {
            if (fachadaInstance == null) {
                fachadaInstance = new FacadeCliente();
            }
        }
        return fachadaInstance;
    }
}
