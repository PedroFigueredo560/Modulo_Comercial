/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.infrastructure.service;

/**
 *
 * @author Pedro Henrique
 */
public class FacadeInstance {
     /**
     * Represents the singleton instance of the class.
     */
    private static IFacade fachadaInstance;

    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();
    
    /**
     * Create a new instance of this class.
     */
    public FacadeInstance() {
        super();
    }
    
    /**
     * Return a new instance of Facade if there's not.
     * @return 
     */
    public static IFacade getInstance() {
        synchronized (MONITOR) {
            if (fachadaInstance == null) {
                fachadaInstance = new Facade();
            }
        }
        return fachadaInstance;
    }
}
