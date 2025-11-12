package restaurant.factory.soup;

import restaurant.visitor.OrderVisitor;

public class Ramen implements Soup {
    public String getDescription(){
        return "Ramen";
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
