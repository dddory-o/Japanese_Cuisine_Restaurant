package restaurant.factory.meal;

import restaurant.factory.Product;
import restaurant.visitor.OrderVisitor;

public interface Meal extends Product {
    Meal getDescription();
    double getCost();
    int getQuantity();
    int getCalories();

    void accept(OrderVisitor visitor);


}
