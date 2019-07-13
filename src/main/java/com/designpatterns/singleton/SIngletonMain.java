package com.designpatterns.singleton;

public class SIngletonMain
{

    public static void main (String[] args)
    {
       
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println(anotherInstance);
        
        /*
        
        Output :
        
        com.designpatterns.singleton.Singleton@7852e922
        com.designpatterns.singleton.Singleton@7852e922
        
        *
        */
    }

}
