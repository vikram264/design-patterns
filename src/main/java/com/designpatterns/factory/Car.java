package com.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Car implements Specification
{

    protected List<Specification> specifications = new ArrayList<>();

    public Car ()
    {
        manufactureCar();
        description();
       
    }

    protected abstract void manufactureCar ();

    @Override
    public String toString ()
    {
        return "Car [specifications=" + specifications + "]";
    }

    
    
    
}
