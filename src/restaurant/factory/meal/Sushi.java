package restaurant.factory.meal;

import restaurant.visitor.OrderVisitor;

public class Sushi implements Meal {
    public Meal getDescription(){
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

    public void accept(OrderVisitor visitor){
        visitor.visit(this);
    }
}
