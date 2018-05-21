/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.exceptions;

/**
 * This class is used for the purpose of Handling the NotToBeColleaguesException.
 * @author 
 */
public class NotToBeColleaguesException extends Exception{
    
    public NotToBeColleaguesException() {
        super();
    }
     public NotToBeColleaguesException(String message) {
        super(message);
    }

    public NotToBeColleaguesException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotToBeColleaguesException(Throwable cause) {
        super(cause);
    } 
    
}
