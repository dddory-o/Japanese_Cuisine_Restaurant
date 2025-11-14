package restaurant.decorator;

import restaurant.factory.Product;
import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

public class ChopstickDecorator extends ProductDecorator {
    public ChopstickDecorator(Product decoratedProduct) {
        super(decoratedProduct);
        this.addition = "Chopsticks";
    }

    @Override
    public String getDescription(){
        return decoratedProduct.getDescription() + ", Chopsticks";
    }

    @Override
    public int getQuantity(){
        return decoratedProduct.getQuantity();
    }

    @Override
    public double getCost(){
        return decoratedProduct.getCost() + 50;
    }

    @Override
    public void accept(OrderVisitor visitor){
        decoratedProduct.accept(visitor);
    }
}
