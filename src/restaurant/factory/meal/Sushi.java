package restaurant.factory.meal;

import restaurant.visitor.MealVisitor;

public class Sushi implements Meal {
    public String getDescription(){
        return "Sushi";
    }
    public double getCost(){
        return 2000;
    }
    public int getQuantity(){
        return 8;
    }
    public int getCalories(){
        return 700;
    }
}
