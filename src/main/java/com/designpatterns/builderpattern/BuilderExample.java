package com.designpatterns.builderpattern;

public class BuilderExample
{
    public static void main (String[] args)
    {
        Car.Builder carBuilder = new Car.Builder().airBags("2")
            .engine("BoosterJet")
            .mileage(17);
        
        Car car = carBuilder.build();
        
        System.out.println(car.toString());
    }
}
