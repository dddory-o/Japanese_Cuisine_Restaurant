package restaurant.factory.drink;

import restaurant.visitor.OrderVisitor;

public class Sprite implements Drink {
    public String getDescription(){
        return "Sprite";
    }

    @Override
    public int getQuantity() {
        return 1;
    }

    public double getCost(){
        return 500;
    }
    public int getCalories(){ return 200; }

    public void accept(OrderVisitor visitor){
        visitor.visit(this);
    }
}
