package restaurant.decorator;

import restaurant.factory.Product;
import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

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
    public int getQuantity(){
        return decoratedProduct.getQuantity();
    }

    @Override
    public int getCalories(){
        return decoratedProduct.getCalories() + 20;
    }

    @Override
    public void accept(OrderVisitor visitor){
        decoratedProduct.accept(visitor);
    }
}
