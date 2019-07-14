package com.designpatterns.builderpattern;

public class Car
{
    private String airBags;
    private String engine;
    private String power;
    private Integer mileage;

    public static class Builder
    {

        private String airBags;
        private String engine;
        private String power;
        private Integer mileage;

        public Builder ()
        {

        }

        public Car build ()
        {
            return new Car(this);
        }

        public Builder airBags (String airBags)
        {
            this.airBags = airBags;
            return this;
        }

        public Builder engine (String engine)
        {
            this.engine = engine;
            return this;
        }

        public Builder power (String power)
        {
            this.power = power;
            return this;
        }

        public Builder mileage (Integer mileage)
        {
            this.mileage = mileage;
            return this;
        }

    }

    public Car (Builder builder)
    {
        this.airBags = builder.airBags;
        this.engine = builder.engine;
        this.power = builder.power;
        this.mileage = builder.mileage;
    }

    // Getters
    public String getAirBags ()
    {
        return airBags;
    }

    public String getEngine ()
    {
        return engine;
    }

    public String getPower ()
    {
        return power;
    }

    public Integer getMileage ()
    {
        return mileage;
    }

    @Override
    public String toString ()
    {
        StringBuilder builder2 = new StringBuilder();
        builder2.append("Car [airBags=");
        builder2.append(airBags);
        builder2.append(", engine=");
        builder2.append(engine);
        builder2.append(", power=");
        builder2.append(power);
        builder2.append(", mileage=");
        builder2.append(mileage);
        builder2.append("]");
        return builder2.toString();
    }

    
}
