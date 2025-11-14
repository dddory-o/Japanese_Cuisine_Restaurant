package restaurant.factory.meal;

import restaurant.factory.Product;
import restaurant.visitor.OrderVisitor;

public interface Meal extends Product {
    String getDescription();
    double getCost();
    int getQuantity();
    int getCalories();

    void accept(OrderVisitor visitor);


}
