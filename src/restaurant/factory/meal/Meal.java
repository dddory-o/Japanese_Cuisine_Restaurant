package restaurant.factory.meal;

import restaurant.visitor.MealVisitor;

public interface Meal {
    String getDescription();
    double getCost();
    int getQuantity();
    int getCalories();
}
