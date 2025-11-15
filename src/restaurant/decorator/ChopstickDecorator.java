package restaurant.decorator;

import restaurant.factory.Product;

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
    public double getCost(){
        return decoratedProduct.getCost() + 50;
    }

}
