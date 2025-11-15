package restaurant.factory.drink;

import restaurant.factory.Product;
import restaurant.visitor.OrderVisitor;

public interface Drink extends Product {
    String getDescription();
    double getCost();
    int getCalories();

    void accept(OrderVisitor visitor);
}
