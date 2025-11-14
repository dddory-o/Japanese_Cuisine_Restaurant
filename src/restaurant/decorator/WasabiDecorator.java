package restaurant.decorator;

import restaurant.factory.Product;
import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

abstract class WasabiDecorator extends ProductDecorator{
    public WasabiDecorator(Product decoratedProduct) {
        super(decoratedProduct);
        this.addition = "Wasabi";
    }

    @Override
    public String getDescription(){
        return decoratedProduct.getDescription() + ", Wasabi";
    }

    @Override
    public double getCost(){
        return decoratedProduct.getCost() + 50;
    }

    @Override
    public int getCalories() {
        return decoratedProduct.getCalories() + 15;
    }

    @Override
    public void accept(OrderVisitor visitor){
        decoratedProduct.accept(visitor);
    }
}
