package restaurant.factory;

import restaurant.visitor.OrderVisitor;

public interface Product {
    String getDescription();
    int getQuantity();
    double getCost();
    int getCalories();
    void accept(OrderVisitor visitor);
}
