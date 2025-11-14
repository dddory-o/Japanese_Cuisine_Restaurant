package restaurant.decorator;

import restaurant.factory.Product;
import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

public class BreadDecorator extends ProductDecorator{
    public BreadDecorator(Product decoratedProduct) {
        super(decoratedProduct);
        this.addition = "Bread";
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
        decoratedProduct.accept(visitor);
    }
}