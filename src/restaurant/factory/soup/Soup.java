package restaurant.factory.soup;

import restaurant.factory.Product;
import restaurant.factory.meal.Meal;
import restaurant.visitor.OrderVisitor;

public interface Soup extends Product {
    Meal getDescription();
    double getCost();
    int getCalories();

    void accept(OrderVisitor visitor);
}
