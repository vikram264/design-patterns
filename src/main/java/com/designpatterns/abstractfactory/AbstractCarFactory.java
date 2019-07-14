package com.designpatterns.abstractfactory;

public abstract class AbstractCarFactory
{

    public static TransmissionFactory getFactory (TransmissionType transmissionType)
    {
        switch (transmissionType) {
        case AUTOMATIC:
            return new AutomaticFactory();
        case MANUAL:
            return new ManualFactory();
        default:
            return null;
        }
    }
}
