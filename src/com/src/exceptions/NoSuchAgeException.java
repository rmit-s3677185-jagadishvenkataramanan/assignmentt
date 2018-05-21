/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.exceptions;

/**
 *
 * This class is used for the purpose of Handling the NoSuchAgeException.
 * @author 
 */
public class NoSuchAgeException extends Exception{
   public NoSuchAgeException() {
        super();
    }
     public NoSuchAgeException(String message) {
        super(message);
    }

    public NoSuchAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchAgeException(Throwable cause) {
        super(cause);
    } 
}
