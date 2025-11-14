package restaurant.decorator;

import restaurant.factory.Product;
import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;
public abstract class ProductDecorator implements Product {
    protected Product decoratedProduct;
    protected String addition;
    public String getOwnAddition() {
        return addition;
    }
    public ProductDecorator(Product decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }
    @Override
    public String getDescription(){
        return decoratedProduct.getDescription();
    }
    @Override
    public int getQuantity(){
        return decoratedProduct.getQuantity();
    }
    @Override
    public double getCost(){
        return decoratedProduct.getCost();
    }

    @Override
    public int getCalories(){
        return decoratedProduct.getCalories();
    }

    @Override
    public void accept(OrderVisitor visitor){
        decoratedProduct.accept(visitor);
    }
}
