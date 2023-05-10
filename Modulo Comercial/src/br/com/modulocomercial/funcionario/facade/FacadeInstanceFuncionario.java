/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.funcionario.facade;

/**
 *
 * @author Pedro Henrique
 */
public class FacadeInstanceFuncionario {
    
    //o singleton da classe
    
    private static IFacadeFuncionario fachadaInstance;

    
    //objeto monitor
    
    private static final Object MONITOR = new Object();

    
    //cria uma nova instancia
     
    public FacadeInstanceFuncionario() {
        super();
    }
    

    public static IFacadeFuncionario getInstance() {
        synchronized (MONITOR) {
            if (fachadaInstance == null) {
                fachadaInstance = new FacadeFuncionario();
            }
        }
        return fachadaInstance;
    }
}
