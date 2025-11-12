package restaurant.factory.meal;

import restaurant.visitor.OrderVisitor;

public class SushiBurger implements Meal{
    public String getDescription(){
        return "Sushi Burger";
    }
    public double getCost(){
        return 2000;
    }
    public int getQuantity(){
        return 1;
    }
    public int getCalories(){
        return 800;
    }

    public void accept(OrderVisitor visitor){
        visitor.visit(this);
    }
}
