package com.designpatterns.factory;

public class MarutiCar extends Car
{

    @Override
    protected void manufactureCar ()
    {
        specifications.add(new MarutiAirBags());
        specifications.add(new MarutiEngine());
        specifications.add(new MarutiPower());
       
        
    }

    @Override
    public void description ()
    {
        specifications.get(0).description();
        specifications.get(1).description();
        specifications.get(2).description();
    }

    

    
}
