package restaurant.factory.soup;

import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

public class MisoSoup implements Soup {
    public Meal getDescription(){
        return "Miso Soup";
    }
    public double getCost(){
        return 1000;
    }
    public int getCalories(){
        return 100;
    }

    public void accept(OrderVisitor visitor){
        visitor.visit(this);
    }
}
