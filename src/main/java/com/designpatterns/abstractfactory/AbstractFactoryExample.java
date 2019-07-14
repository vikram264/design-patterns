package com.designpatterns.abstractfactory;

public class AbstractFactoryExample
{

    public static void main (String[] args)
    {
        TransmissionFactory volkswagenFactory =
            AbstractCarFactory.getFactory(TransmissionType.AUTOMATIC);
        Car volkswagen = volkswagenFactory.create(ManufacturerType.VOLKSWAGEN);
        volkswagen.display();

        TransmissionFactory hyundaiFactory =
            AbstractCarFactory.getFactory(TransmissionType.MANUAL);
        Car hyundai = hyundaiFactory.create(ManufacturerType.HYUNDAI);
        hyundai.display();
    }
}
