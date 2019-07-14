package com.designpatterns.abstractfactory;

public interface TransmissionFactory
{

    Car create(ManufacturerType carType);
}
