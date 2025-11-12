package restaurant.factory.drink;

import restaurant.visitor.OrderVisitor;

public class Fanta implements Drink {
    public String getDescription(){
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
