package restaurant.factory.soup;

import restaurant.factory.Product;
import restaurant.visitor.OrderVisitor;

public interface Soup extends Product {
    String getDescription();
    double getCost();
    int getCalories();

    void accept(OrderVisitor visitor);
}
