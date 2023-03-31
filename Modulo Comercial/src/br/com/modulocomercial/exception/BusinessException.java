/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.exception;

/**
 *
 * @author Pedro Henrique
 */
public class BusinessException extends RuntimeException{
    public BusinessException() {
             super();
        }

         /**
          * Creates a new instance of the exception setting the message.
          * 
          * @param message the error message.
          */
         public BusinessException(final String message) {
             super(message);
         }

         /**
          * Creates a new instance of the exception setting the cause.
          * 
          * @param cause the cause
          */
         public BusinessException(final Throwable cause) {
             super(cause);
         }

         /**
          * Creates a new instance of the exception setting the message and cause.
          * 
          * @param message the error message.
          * @param cause the cause
          */
         public BusinessException(final String message, final Throwable cause) {
             super(message, cause);
         }
    
}
