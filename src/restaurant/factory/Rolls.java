package restaurant.factory;

public class Rolls implements Meal{
    public String getDescription(){
        return "Vinegared sushi rice and fillings like fish or vegetables wrapped in a sheet of nori seaweed.8 pieces";
    }

    public double getCost(){
        return 3000;
    }
}
