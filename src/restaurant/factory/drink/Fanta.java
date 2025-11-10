package restaurant.factory.drink;

import restaurant.visitor.MealVisitor;

public class Fanta implements Drink {
    public String getDescription(){
        return "Fanta";
    }
    public double getCost(){
        return 500;
    }
}
