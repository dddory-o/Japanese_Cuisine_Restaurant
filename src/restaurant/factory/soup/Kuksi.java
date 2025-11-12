package restaurant.factory.soup;

import restaurant.visitor.OrderVisitor;

public class Kuksi implements Soup {
    public String getDescription(){
        return "Kuksi";
    }
    public double getCost(){
        return 2000;
    }
    public int getCalories(){
        return 500;
    }

    public void accept(OrderVisitor visitor){
        visitor.visit(this);
    }

}
