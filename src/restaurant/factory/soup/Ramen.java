package restaurant.factory.soup;

import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

public class Ramen implements Soup {
    public String getDescription(){
        return "Ramen";
    }

    @Override
    public int getQuantity() {
        return 1;
    }

    public double getCost(){
        return 2500;
    }
    public int getCalories(){
        return 600;
    }

    public void accept(OrderVisitor visitor){
        visitor.visit(this);
    }
}
