package restaurant.factory.drink;

import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

public class Fanta implements Drink {
    public Meal getDescription(){
        return "Fanta";
    }
    public double getCost(){
        return 500;
    }
    public int getCalories(){ return 200; }

    public void accept(OrderVisitor visitor){
        visitor.visit(this);
    }
}
