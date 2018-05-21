/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.exceptions;

/**
 *
 * This class is used for the purpose of Handling the NotToBeFriendsException.
 * 
 * @author 
 */
public class NotToBeFriendsException extends Exception{
    
    public NotToBeFriendsException() {
        super();
    }
     public NotToBeFriendsException(String message) {
        super(message);
    }

    public NotToBeFriendsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotToBeFriendsException(Throwable cause) {
        super(cause);
    }
}
