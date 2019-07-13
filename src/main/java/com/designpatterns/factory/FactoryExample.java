package com.designpatterns.factory;

public class FactoryExample
{
    public static void main (String[] args)
    {

       Car maruti = CarFactory.getCar(CarType.MARUTI);
       Car volkswagon = CarFactory.getCar(CarType.VOLKSWAGEN);
       
       System.out.println("Maruti :"+maruti);
       System.out.println("Volkswagon :"+volkswagon);
    }
}
