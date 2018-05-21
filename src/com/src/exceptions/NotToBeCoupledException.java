/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.exceptions;

/**
 * This class is used for the purpose of Handling the NotToBeCoupledException.
 * @author 
 */
public class NotToBeCoupledException extends Exception{
    public NotToBeCoupledException() {
        super();
    }
     public NotToBeCoupledException(String message) {
        super(message);
    }

    public NotToBeCoupledException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotToBeCoupledException(Throwable cause) {
        super(cause);
    }
}
