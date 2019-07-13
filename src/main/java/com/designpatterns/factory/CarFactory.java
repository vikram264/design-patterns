package com.designpatterns.factory;

public class CarFactory
{

    public static Car getCar (CarType carType)
    {
        switch (carType) {
        case MARUTI:
            return new MarutiCar();
        case VOLKSWAGEN:
            return new VolkswagenCar();
        default:
            return null;
        }
    }
}
