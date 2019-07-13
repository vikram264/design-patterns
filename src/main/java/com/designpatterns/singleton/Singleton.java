package com.designpatterns.singleton;

/**
 * @author i334499
 * Singleton Features
 * 1. Static in nature
 * 2. Thread Safe
 * 3.Private constructor
 * 4.private Instance of the class
 * 5. No args constructor
 */
public class Singleton
{

    // Use lady loading using the volatile keyword
    private static volatile Singleton instance = null;

    private Singleton ()
    {

    }

    public static Singleton getInstance ()
    {
        if (instance == null) {
            // Do not use synchronized for double check, as there chances the
            // other threads might get the half intialized version of instance.
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }

        }
        return instance;

    }
}
