package restaurant.decorator;

import restaurant.factory.Product;
import restaurant.visitor.OrderVisitor;
public abstract class ProductDecorator implements Product {
    protected final Product decoratedProduct;
    protected String addition;
    public ProductDecorator(Product decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }
    public String getOwnAddition() {
        return addition;
    }

    public Product getWrappedProduct() {
        return decoratedProduct;
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
