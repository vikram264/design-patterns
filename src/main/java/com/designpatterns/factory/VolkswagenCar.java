package com.designpatterns.factory;

public class VolkswagenCar extends Car
{

    @Override
    protected void manufactureCar ()
    {
        specifications.add(new VolkswagonAirBags());
        specifications.add(new VolkswagonPower());
        specifications.add(new VolkswagonEngine());

    }

    @Override
    public void description ()
    {
        specifications.get(0)
            .description();
        specifications.get(1)
            .description();
        specifications.get(2)
            .description();
    }

    
}
