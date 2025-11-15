package restaurant.decorator;

import restaurant.factory.Product;

public class SoySauceDecorator extends ProductDecorator {
    public SoySauceDecorator(Product decoratedProduct) {
        super(decoratedProduct);
        this.addition = "SoySauce";
    }

    @Override
    public String getDescription(){
        return decoratedProduct.getDescription() + ", Soy Sauce";
    }

    @Override
    public double getCost(){
        return decoratedProduct.getCost() + 100;
    }

    @Override
    public int getCalories(){
        return decoratedProduct.getCalories() + 20;
    }

}
