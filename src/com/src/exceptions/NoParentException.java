/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.exceptions;

/**
 *This class is used for the purpose of Handling the NoParentException.
 * @author 
 */
public class NoParentException extends Exception{
    public NoParentException() {
        super();
    }
     public NoParentException(String message) {
        super(message);
    }

    public NoParentException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoParentException(Throwable cause) {
        super(cause);
    }
}
