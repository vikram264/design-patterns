package com.designpatterns.abstractfactory;

public class AutomaticFactory implements TransmissionFactory
{

    @Override
    public Car create (ManufacturerType manufacturerType)
    {
        switch (manufacturerType) {
        case MARUTI:
            return new MarutiCar();
        case VOLKSWAGEN:
            return new VolkswagenCar();

        default:
            return null;
        }
    }

}
