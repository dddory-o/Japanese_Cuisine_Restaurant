package restaurant.factory.meal;

import restaurant.visitor.OrderVisitor;

public class Rolls implements Meal {
    public Meal getDescription(){
        return "Rolls";
    }
    public double getCost(){
        return 3000;
    }
    public int getQuantity(){
        return 8;
    }
    public int getCalories(){
        return 900;
    }

    public void accept(OrderVisitor visitor){
        visitor.visit(this);
    }
}
