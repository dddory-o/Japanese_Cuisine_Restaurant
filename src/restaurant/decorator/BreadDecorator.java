package restaurant.decorator;

import restaurant.factory.soup.Soup;
import restaurant.visitor.OrderVisitor;

public class BreadDecorator extends SoupDecorator{
    public BreadDecorator(Soup decoratedSoup) {
        super(decoratedSoup);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + ", Bread";
    }

    @Override
    public double getCost() {
        return super.getCost() + 250;
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 150;
    }

    @Override
    public void accept(OrderVisitor visitor){
        decoratedSoup.accept(visitor);
    }
}