/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.exceptions;

/**
 *
 * @author 
 */
public class NoProfileFound extends Exception{
    
    public NoProfileFound() {
        super();
    }
     public NoProfileFound(String message) {
        super(message);
    }

    public NoProfileFound(String message, Throwable cause) {
        super(message, cause);
    }

    public NoProfileFound(Throwable cause) {
        super(cause);
    }
    
}
