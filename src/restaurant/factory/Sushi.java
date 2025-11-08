package restaurant.factory;

import java.sql.SQLOutput;

public class Sushi implements Meal{
    public String getDescription(){
        return "Sushi";
    }
    public double getCost(){
        return 2000;
    }
}
