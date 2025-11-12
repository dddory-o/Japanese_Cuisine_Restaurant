package restaurant.decorator;

import restaurant.factory.soup.Soup;
import restaurant.visitor.OrderVisitor;

abstract class SoupDecorator implements Soup {
    protected Soup decoratedSoup;
    public SoupDecorator(Soup decoratedSoup) {
        this.decoratedSoup = decoratedSoup;
    }

    @Override
    public String getDescription(){
        return decoratedSoup.getDescription();
    }

    @Override
    public double getCost(){
        return decoratedSoup.getCost();
    }

    @Override
    public int getCalories(){
        return decoratedSoup.getCalories();
    }

    @Override
    public void accept(OrderVisitor visitor){
        decoratedSoup.accept(visitor);
    }
}
