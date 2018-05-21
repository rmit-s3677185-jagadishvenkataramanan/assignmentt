package com.src.assign2;

import com.src.exceptions.NoAvailableException;
import com.src.exceptions.NoParentException;
import com.src.exceptions.NotToBeCoupledException;
import com.src.exceptions.NotToBeFriendsException;
import com.src.exceptions.TooYoungException;
import java.util.ArrayList;

/**
 * 
 * @author 
 */

public abstract class User {
	
    protected String name,status;
    protected String image;
    protected int age;
    protected ArrayList<User> friendList;
    //accessors fetches private data stored in the object
    public String getName()
    {
        return name;
    }

    public String getStatus()
    {
        return status;
    }

    public String getImage()
    {
        return image;
    }

    public int getAge()
    {
        return age;
    }

    public void displayDetails()
    {
        System.out.println("Name: " + name + "\nStatus: " + status + "\nImage: " + image
                + "\nAge: " + age + "\n\n");
    }

    public void addFriend(User addee)
    {
        if(age<16 && this instanceof Child)
        {
            if(addee.getAge()>=16 || !((Child) this).isChild((Adult) addee))
            {
                try{
                   throw new NoParentException();
                }
                catch(NoParentException exception){
                    exception.printStackTrace();
                }
                
               // System.out.println("Children cannot add adults except parents. Only children can be friends of children");
            }
            else if(Math.abs(addee.getAge()-age)>3)
            {
                try{
                    throw new NotToBeFriendsException();
                }
                catch(NotToBeFriendsException exception){
                    exception.printStackTrace();
                }
                //System.out.println("Children cannot have friends older than 3 years gap");
            }
            else if(age<=2)
            {
            try{
                  throw new TooYoungException(); 
                }
                catch(TooYoungException e){ 
                    e.printStackTrace();
                }
               // System.out.println("Toddlers cannot have friends.");
               
            }
            else if(!((Child) this).isSibling((Child) addee))
            {
                friendList.add(addee);
            }
            else
            { 
                try{
                    throw new NotToBeCoupledException();
                }
                catch(NotToBeCoupledException exception){ 
                    exception.printStackTrace();
                }
                //System.out.println("Cannot add siblings");
            }
        }
        else
        {
            if(addee.age<16 && !((Child)addee).isChild((Adult)this))
            {
                try{
                     throw new NoAvailableException();
                }
                catch(NoAvailableException exception){
                    exception.printStackTrace();
                } 
             //System.out.println("Children cannot add adults except parents. Only children can be friends of children");
            }
            else
            {
                friendList.add(addee);
            }
        }
    }

    public boolean isFriend(String conn)
    {
        for (User friend: friendList) {
            if(conn.equalsIgnoreCase(friend.getName()))
            {
                return true;
            }
        }
        return false;
    }

    public void updateprofile(String name,int age,String status)
    {
    	//Update profile information
        this.name=name;
        if(age!=-1)
        this.age=age;
        if(status!=null)
        this.status=status;
    }

}