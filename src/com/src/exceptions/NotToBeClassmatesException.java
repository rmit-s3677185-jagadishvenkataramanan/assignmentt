/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.exceptions;

/**
 * This class is used for the purpose of Handling the NotToBeClassmatesException.
 * @author 
 */
public class NotToBeClassmatesException extends Exception{
    
    public NotToBeClassmatesException() {
        super();
    }
     public NotToBeClassmatesException(String message) {
        super(message);
    }

    public NotToBeClassmatesException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotToBeClassmatesException(Throwable cause) {
        super(cause);
    } 

}
