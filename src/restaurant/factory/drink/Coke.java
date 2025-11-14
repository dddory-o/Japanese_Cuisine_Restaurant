package restaurant.factory.drink;

import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

public class Coke implements Drink {
    public String getDescription(){
        return "Coke";
    }

    @Override
    public int getQuantity() {
        return 1;
    }

    public double getCost(){
        return 600;
    }
    public int getCalories(){ return 200; }

    public void accept(OrderVisitor visitor){
        visitor.visit(this);
    }
}
