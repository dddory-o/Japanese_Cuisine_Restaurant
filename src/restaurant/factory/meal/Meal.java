package restaurant.factory.meal;

import restaurant.visitor.OrderVisitor;

public interface Meal {
    String getDescription();
    double getCost();
    int getQuantity();
    int getCalories();

    void accept(OrderVisitor visitor);


}
