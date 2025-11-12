package restaurant.factory.soup;

import restaurant.visitor.OrderVisitor;

public interface Soup {
    String getDescription();
    double getCost();
    int getCalories();

    void accept(OrderVisitor visitor);
}
