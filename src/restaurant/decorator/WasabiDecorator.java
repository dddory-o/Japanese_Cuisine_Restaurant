package restaurant.decorator;

import restaurant.factory.Product;

public class WasabiDecorator extends ProductDecorator{
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

}
