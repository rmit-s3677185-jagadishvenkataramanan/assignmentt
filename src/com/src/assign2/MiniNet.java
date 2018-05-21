package com.src.assign2;

import com.src.exceptions.NoProfileFound;
import com.src.exceptions.NotToBeColleaguesException;

/**
 * 
 * This class is used to invoke the Driver class
 * 
 * @author Sai
 */



public class MiniNet {

    public static  void main(String args[]) throws NoProfileFound, NotToBeColleaguesException
    {
        Driver obj = new Driver();
        obj.run();
    } 

}
