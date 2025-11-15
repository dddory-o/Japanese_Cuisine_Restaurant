package restaurant.factory.soup;

import restaurant.visitor.OrderVisitor;

public class MisoSoup implements Soup {
    public String getDescription(){
        return "Miso Soup";
    }

    @Override
    public int getQuantity() {
        return 1;
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
