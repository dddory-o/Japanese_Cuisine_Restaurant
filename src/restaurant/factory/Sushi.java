package restaurant.factory;

import java.sql.SQLOutput;

public class Sushi implements Meal{
    public String getDescription(){
        return "Japanese dish made from vinegared rice, often combined with various ingredients.8 pieces";
    }

    public double getCost(){
        return 2000;
    }
}
