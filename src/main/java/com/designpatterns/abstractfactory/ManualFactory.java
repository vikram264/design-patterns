package com.designpatterns.abstractfactory;

public class ManualFactory implements TransmissionFactory
{

    @Override
    public Car create (ManufacturerType manufacturerType)
    {
        switch (manufacturerType) {
        case HYUNDAI:
            return new HyundaiCar();
        case FORD:
            return new FordCar();
        default:
            return null;
        }

    }

}
