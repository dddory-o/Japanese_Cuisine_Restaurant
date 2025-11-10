package restaurant.factory.drink;

import restaurant.visitor.MealVisitor;

public interface Drink {
    String getDescription();
    double getCost();
}
