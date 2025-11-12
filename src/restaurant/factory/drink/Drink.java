package restaurant.factory.drink;

import restaurant.visitor.OrderVisitor;

public interface Drink {
    String getDescription();
    double getCost();
    int getCalories();

    void accept(OrderVisitor visitor);
}
