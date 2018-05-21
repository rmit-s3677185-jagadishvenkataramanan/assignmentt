/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.exceptions;

/**
 *
 * This class is used for the purpose of Handling the TooYoungException.
 * 
 * @author 
 */
public class TooYoungException extends Exception{
    public TooYoungException() {
        super();
    }
     public TooYoungException(String message) {
        super(message);
    }

    public TooYoungException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooYoungException(Throwable cause) {
        super(cause);
    }
}
